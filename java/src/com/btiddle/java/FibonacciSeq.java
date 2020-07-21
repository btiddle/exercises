/*
Title:
    Fibonacci Sequence

Exercise:
    Write a method that returns a Fibonacci sequence from 1 to n.

Hint:
  Sequence begins with 0 and 1.
  Subsequent values are sum of previous two values.
  Valid range is fibonacci(0) .. fibonacci(47) when using Java int
  with range (-2,147,483,648 .. 2,147,483,647).
*/

package com.btiddle.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeq {

    public static List<Integer> fibonacciSeq(int n) {
        if (n < 0 || n > 47) {
            throw new IllegalArgumentException(
                    "Error: Range for n is 0 to 47. Value of n is " + n);
        }

        if (n == 0) {
            return new ArrayList<>();
        }

        if (n == 1) {
            return Arrays.asList(0);
        }

        if (n == 2) {
            return Arrays.asList(0, 1);

        }
        final List<Integer> seq = new ArrayList<>(n);
        seq.add(0);
        n = n - 1;
        seq.add(1);
        n = n - 1;

        while (n > 0) {
            int a = seq.get(seq.size() - 1);
            int b = seq.get(seq.size() - 2);
            seq.add(a + b);
            n = n - 1;
        }

        return seq;
    }
}
