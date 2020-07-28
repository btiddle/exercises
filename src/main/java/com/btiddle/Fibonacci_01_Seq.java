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

package main.java.com.btiddle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci_01_Seq {

    public static List<Integer> fibonacciSeq(int n) {
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
}
