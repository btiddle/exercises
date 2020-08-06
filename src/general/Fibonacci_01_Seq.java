/*
Title:
    Fibonacci Sequence

Exercise:
    Write a method that returns a Fibonacci sequence from 0 to n.

Insights:
    Sequence begins with 0 and 1.

    Subsequent values are derived as sum of previous two values.

    Range of Java int is -2,147,483,648 .. 2,147,483,647.

    fibonacci(46) = 1,836,311,903 can be calculated using Java int.
    fibonacci(47) = 2,971,215,073 can not be calculated using Java int
    becasue it is out side the range for Java int. For values 47 and
    above, solution is to use the BigInteger data type.
*/

package general;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fibonacci_01_Seq {

    static List<Integer> fibonacciSeq(int n) {
        if (n < 0 || n > 46) {
            throw new IllegalArgumentException(
                    "Error: Range for n is 0 to 46. Value of n is " + n);
        }

        if (n == 0) {
            return Arrays.asList(0);
        }

        if (n == 1) {
            return Arrays.asList(0, 1);

        }
        final List<Integer> seq = new ArrayList<>(n);
        seq.add(0);
        n = n - 1;
        seq.add(1);
        n = n - 1;

        while (n >= 0) {
            int a = seq.get(seq.size() - 1);
            int b = seq.get(seq.size() - 2);
            seq.add(a + b);
            n = n - 1;
        }

        return seq;
    }

    private final List<Integer> expected = Arrays.asList(
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
            144, 233, 377, 610, 987, 1597, 2584, 4181,
            6765, 10946, 17711, 28657, 46368, 75025, 121393,
            196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817,
            39088169, 63245986, 102334155, 165580141, 267914296,
            433494437, 701408733, 1134903170, 1836311903);

    @Test
    void fibonacci_sequence_from_0_to_46() {
        Assertions.assertEquals(expected, Fibonacci_01_Seq.fibonacciSeq(46));
    }

    @Test
    void fibonacci_sequence_from_0_to_46_Print() {
        for (int i = 0; i <= 46; i++) {
            System.out.println(Fibonacci_01_Seq.fibonacciSeq(i));
        }
    }

    @Test
    void fibonacci_sequence_neg_one_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci_01_Seq.fibonacciSeq(-1);
        });

        String expectedMessage = "Error: Range for n is 0 to 46.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void fibonacci_sequence_47_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci_01_Seq.fibonacciSeq(47);
        });

        String expectedMessage = "Error: Range for n is 0 to 46.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
