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

package main.java.com.btiddle;

public class Factorial_01_Iterative {

    public static long factorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "n must be greater than zero");
        }
        long toReturn = 1;
        for (int i = 1; i <= n; i++) {
            toReturn *= i;
        }
        return toReturn;
    }
}
