/*
Title:
    FizzBuzz

Exercise:
    Write an algorithm that prints all numbers between 1 and n, replacing
    multiples of 3 with the String Fizz, multiples of 5 with Buzz, and
    multiples of 15 with FizzBuzz.

Insights:
    Check 15 before 3 and 5.
*/

package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzbuzz(int n) {
        final List<String> seq = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                seq.add("FizzBuzz");
            } else if (i % 3 == 0) {
                seq.add("Fizz");
            } else if (i % 5 == 0) {
                seq.add("Buzz");
            } else {
                seq.add(Integer.toString(i));
            }
        }

        return seq;
    }
}
