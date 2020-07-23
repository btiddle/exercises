/*
Title:
    Fibonacci using BigInteger

Exercise:
    Write a method that returns a Fibonacci sequence from 1 to n,
    where n can be greater than 47.

Hint:
  Sequence begins with 0 and 1.
  Subsequent values are derived as sum of previous two values.
  Because Java int range is (-2,147,483,648 .. 2,147,483,647)
  will need to use BigInteger to go beyond 47th position.
*/

package main.java.com.btiddle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeqBigInt {

    public static List<BigInteger> fibonacciSeqBigInt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "n must not be less than zero");
        }

        if (n == 0) {
            return new ArrayList<>();
        }

        if (n == 1) {
            return Arrays.asList(BigInteger.valueOf(1));
        }

        if (n == 2) {
            return Arrays.asList(BigInteger.valueOf(1), BigInteger.valueOf(2));

        }
        final List<BigInteger> seq = new ArrayList<>(n);
        seq.add(BigInteger.valueOf(0));
        n = n - 1;
        seq.add(BigInteger.valueOf(1));
        n = n - 1;

        while (n > 0) {
            BigInteger a = seq.get(seq.size() - 1);
            BigInteger b = seq.get(seq.size() - 2);
            seq.add(a.add(b));
            n = n - 1;
        }

        return seq;
    }
}
