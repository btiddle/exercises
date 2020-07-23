/*
Title:
    Fibonacci Nth Position Recursive Less Efficient

Exercise:
    Write a method that returns the nth value of the Fibonacci sequence.
    nth is zero based, i.e. Passing the value 0 would return 0;
    1 would return 1; 2 would return 1; and so on.

Hint:
    Sequence begins with 0 and 1.
    Subsequent values are derived as sum of previous two values.
    Because Java int range is (-2,147,483,648 .. 2,147,483,647)
    will need to use BigInteger to go beyond 47th position.
    This is more efficint then generating entire list and
    returning just the last element. However, can be made
    even more efficient.
*/

package main.java.com.btiddle;

public class Fibonacci_03_Nth_Recursive_Less_Efficient {

    public static int fibonacciNth(int n) {
        if (n < 0 || n > 46) {
            throw new IllegalArgumentException(
                    "n must be in range 0 to 46");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return (fibonacciNth(n - 1) + fibonacciNth(n - 2));
    }
}
