/*
Title:
    Fibonacci Nth Position Iterative

Exercise:
    Return the fibonacci number at the specified index.
    For example, index = 4, should print "3" (i.e. 0, 1, 1, 2, 3).

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

import static general.Fibonacci_03_Nth_Position_Iterative.fibonacci;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class Fibonacci_03_Nth_Position_Iterative_Test {

    @Test
    void fibonacci_nth_0_to_46() {
        assertEquals(0, fibonacci(0));
        assertEquals(1, fibonacci(1));
        assertEquals(1, fibonacci(2));
        assertEquals(2, fibonacci(3));
        assertEquals(3, fibonacci(4));
        assertEquals(5, fibonacci(5));
        assertEquals(8, fibonacci(6));
        assertEquals(13, fibonacci(7));
        assertEquals(21, fibonacci(8));
        assertEquals(34, fibonacci(9));
        assertEquals(55, fibonacci(10));
        assertEquals(89, fibonacci(11));
        assertEquals(144, fibonacci(12));
        assertEquals(233, fibonacci(13));
        assertEquals(377, fibonacci(14));
        assertEquals(610, fibonacci(15));
        assertEquals(987, fibonacci(16));
        assertEquals(1597, fibonacci(17));
        assertEquals(2584, fibonacci(18));
        assertEquals(4181, fibonacci(19));
        assertEquals(6765, fibonacci(20));
        assertEquals(10946, fibonacci(21));
        assertEquals(17711, fibonacci(22));
        assertEquals(28657, fibonacci(23));
        assertEquals(46368, fibonacci(24));
        assertEquals(75025, fibonacci(25));
        assertEquals(121393, fibonacci(26));
        assertEquals(196418, fibonacci(27));
        assertEquals(317811, fibonacci(28));
        assertEquals(514229, fibonacci(29));
        assertEquals(832040, fibonacci(30));
        assertEquals(1346269, fibonacci(31));
        assertEquals(2178309, fibonacci(32));
        assertEquals(3524578, fibonacci(33));
        assertEquals(5702887, fibonacci(34));
        assertEquals(9227465, fibonacci(35));
        assertEquals(14930352, fibonacci(36));
        assertEquals(24157817, fibonacci(37));
        assertEquals(39088169, fibonacci(38));
        assertEquals(63245986, fibonacci(39));
        assertEquals(102334155, fibonacci(40));
        assertEquals(165580141, fibonacci(41));
        assertEquals(267914296, fibonacci(42));
        assertEquals(433494437, fibonacci(43));
        assertEquals(701408733, fibonacci(44));
        assertEquals(1134903170, fibonacci(45));
        assertEquals(1836311903, fibonacci(46));

    }

    static final String expectedMessage = ".*index must be in range 0 to 46.*";

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void fibonacci_nth_neg_one_then_exception() {
        fibonacci(-1);
    }

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void fibonacci_nth_47_then_exception() {
        fibonacci(47);
    }

    @Test
    void fibonacci_print() {
        for (int i = 0; i <= 46; i++)
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
    }
}
