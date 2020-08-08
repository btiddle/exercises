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

public class Fibonacci_04_Nth_Position_Recursive {

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
