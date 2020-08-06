/*
Title:
    Fibonacci Nth Position Recursive

Exercise:
    Write a method that returns the nth value of the Fibonacci sequence.
    nth is zero based, i.e. Passing the value 0 would return 0;
    1 would return 1; 2 would return 1; and so on.

Insights:
    Sequence begins with 0 and 1.

    Subsequent values are derived as sum of previous two values.

    Range of Java int is -2,147,483,648 .. 2,147,483,647.

    fibonacci(46) = 1,836,311,903 can be calculated using Java int.
    fibonacci(47) = 2,971,215,073 can not be calculated using Java int
    becasue it is out side the range for Java int. For values 47 and
    above, solution is to use the BigInteger data type.

    This is more efficient then generating entire list and returning just
    the last element. However, can be made to be more efficient by not
    calculating the same value multiple times.
*/

package general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Fibonacci_04_Nth_Position_Recursive {

    static int fibonacciNth(int n) {
        if (n < 0 || n > 46) {
            throw new IllegalArgumentException(
                    "n must be in range 0 to 46");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return (fibonacciNth(n - 1) + fibonacciNth(n - 2));
    }

    @Test
    void fibonacci_nth_0() {
        Assertions.assertEquals(0, Fibonacci_04_Nth_Position_Recursive.fibonacciNth(0));
    }

    @Test
    void fibonacci_nth_1() {
        Assertions.assertEquals(1, Fibonacci_04_Nth_Position_Recursive.fibonacciNth(1));
    }

    @Test
    void fibonacci_nth_2() {
        Assertions.assertEquals(1, Fibonacci_04_Nth_Position_Recursive.fibonacciNth(2));
    }

    @Test
    void fibonacci_nth_3() {
        Assertions.assertEquals(2, Fibonacci_04_Nth_Position_Recursive.fibonacciNth(3));
    }

    @Test
    void fibonacci_nth_46() {
        Assertions.assertEquals(1836311903, Fibonacci_04_Nth_Position_Recursive.fibonacciNth(46));
    }

    @Test
    void fibonacci_nth_47_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci_04_Nth_Position_Recursive.fibonacciNth(47);
        });

        String expectedMessage = "n must be in range 0 to 46";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void fibonacci_nth_neg_one_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci_04_Nth_Position_Recursive.fibonacciNth(-1);
        });

        String expectedMessage = "n must be in range 0 to 46";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
