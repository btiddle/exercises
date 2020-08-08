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

import static general.Fibonacci_04_Nth_Position_Recursive.fibonacciNth;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class Fibonacci_04_Nth_Position_Recursive_Test {

    @Test
    public void fibonacci_nth_0() {
        assertEquals(0, fibonacciNth(0));
    }

    @Test
    public void fibonacci_nth_1() {
        assertEquals(1, fibonacciNth(1));
    }

    @Test
    public void fibonacci_nth_2() {
        assertEquals(1, fibonacciNth(2));
    }

    @Test
    public void fibonacci_nth_3() {
        assertEquals(2, fibonacciNth(3));
    }

    @Test
    public void fibonacci_nth_46() {
        assertEquals(1836311903, fibonacciNth(46));
    }

    final static String expectedMessage = ".*n must be in range 0 to 46.*";

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void fibonacci_nth_neg_one_then_exception() {
        fibonacciNth(-1);
    }

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void fibonacci_nth_47_then_exception() {
        fibonacciNth(47);
    }
}
