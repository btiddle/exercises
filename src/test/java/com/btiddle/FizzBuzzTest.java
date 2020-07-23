package test.java.com.btiddle;

import static main.java.com.btiddle.FizzBuzz.fizzbuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {

    private final List<String> expected = Arrays.asList(
            "1", "2", "Fizz",
            "4", "Buzz", "Fizz",
            "7", "8", "Fizz",
            "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz",
            "16", "17", "Fizz",
            "19", "Buzz");

    @Test
    public void vanillaFizzBuzz() {
        assertEquals(expected, fizzbuzz(20));
    }

}


