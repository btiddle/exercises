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

import static general.FizzBuzz.fizzbuzz;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz_Test {

    private final List<String> expected = Arrays.asList(
            "1", "2", "Fizz",
            "4", "Buzz", "Fizz",
            "7", "8", "Fizz",
            "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz",
            "16", "17", "Fizz",
            "19", "Buzz");

    @Test
    public void FizzBuzz() {
        assertEquals(expected, fizzbuzz(20));
    }
}
