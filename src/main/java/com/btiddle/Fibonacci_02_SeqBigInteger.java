/*
Title:
    Fibonacci using BigInteger

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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci_02_SeqBigInteger {

    public static List<BigInteger> fibonacciSeqBigInt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "n must not be less than zero");
        }

        if (n == 0) {
            return Arrays.asList(BigInteger.valueOf(0));
        }

        if (n == 1) {
            return Arrays.asList(BigInteger.valueOf(0), BigInteger.valueOf(1));

        }
        final List<BigInteger> seq = new ArrayList<>(n);
        seq.add(BigInteger.valueOf(0));
        n = n - 1;
        seq.add(BigInteger.valueOf(1));
        n = n - 1;

        while (n >= 0) {
            BigInteger a = seq.get(seq.size() - 1);
            BigInteger b = seq.get(seq.size() - 2);
            seq.add(a.add(b));
            n = n - 1;
        }

        return seq;
    }
}
