/*
Title:
    Factorial Iterative

Exercise:
    Write a factorial implementation that does not use recursion.

Insights:
    In mathematics, the factorial of a positive integer n, denoted by n!, is
    the product of all positive integers less than or equal to n:
    n! = n x (n-1) x (n-2) x (n-3) x ... x 3 x 2 x 1
    For example,
    5! = 5 x 4 x 3 x 2 x 1 = 120
    The value 0! = 1.

    Using long is better then int because value gets big quick. BigInteger is
    is better then long because BigInteger objects have no upper bound.
*/

package general;

import static general.Factorial_01_Iterative.factorial;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class Factorial_01_Iterative_Test {

    private final String expectedMessage = ".*n must be greater than zero.*";

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void factorial_neg_one_then_exception() {
        factorial(-1);
    }

    @Test (expectedExceptions = { IllegalArgumentException.class },
            expectedExceptionsMessageRegExp = expectedMessage )
    public void factorial_zero_then_exception() {
        factorial(0);
    }

    @Test
    public void factorial_1() {
        assertEquals(1, factorial(1));
    }

    @Test
    public void factorial_2() {
        assertEquals(2, factorial(2));
    }

    @Test
    public void factorial_3_to_20() {
        assertEquals(6L, factorial(3));
        assertEquals(24L, factorial(4));
        assertEquals(120L, factorial(5));
        assertEquals(720L, factorial(6));
        assertEquals(5040L, factorial(7));
        assertEquals(40320L, factorial(8));
        assertEquals(362880L, factorial(9));
        assertEquals(3628800L, factorial(10));
        assertEquals(39916800L, factorial(11));
        assertEquals(479001600L, factorial(12));
        assertEquals(6227020800L, factorial(13));
        assertEquals(87178291200L, factorial(14));
        assertEquals(1307674368000L, factorial(15));
        assertEquals(20922789888000L, factorial(16));
        assertEquals(355687428096000L, factorial(17));
        assertEquals(6402373705728000L, factorial(18));
        assertEquals(121645100408832000L, factorial(19));
        assertEquals(2432902008176640000L, factorial(20));
    }

    @Test
    public void print_factorial_1_to_20() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("factorial(" + i + ") = " + factorial(i));
        }
    }
}
