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

import static general.Fibonacci_01_Seq.fibonacciSeq;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Fibonacci_01_Seq_Test {

    private final List<Integer> expected = Arrays.asList(
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
            144, 233, 377, 610, 987, 1597, 2584, 4181,
            6765, 10946, 17711, 28657, 46368, 75025, 121393,
            196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817,
            39088169, 63245986, 102334155, 165580141, 267914296,
            433494437, 701408733, 1134903170, 1836311903);

    @Test
    public void fibonacci_sequence_from_0_to_46() {
        assertEquals(expected, fibonacciSeq(46));
    }

    @Test
    public void fibonacci_sequence_from_0_to_46_Print() {
        for (int i = 0; i <= 46; i++) {
            System.out.println(fibonacciSeq(i));
        }
    }

    final static String expectedMessage = ".*Range for n is 0 to 46..*";

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void fibonacci_nth_neg_one_then_exception() {
        fibonacciSeq(-1);
    }

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void fibonacci_nth_47_then_exception() {
        fibonacciSeq(47);
    }
}
