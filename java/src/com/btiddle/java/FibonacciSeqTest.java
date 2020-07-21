package com.btiddle.java;

import static com.btiddle.java.FibonacciSeq.fibonacciSeq;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FibonacciSeqTest {

    private final List<Integer> expected = Arrays.asList(
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
            144, 233, 377, 610, 987, 1597, 2584, 4181,
            6765, 10946, 17711, 28657, 46368, 75025, 121393,
            196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817,
            39088169, 63245986, 102334155, 165580141, 267914296,
            433494437, 701408733, 1134903170, 1836311903);

    @Test
    void fibonacci_sequence_from_1_to_47() {
        assertEquals(expected, fibonacciSeq(47));
    }

    @Test
    void fibonacci_sequence_0_then_empety() {
        assertEquals(new ArrayList<Integer>(), fibonacciSeq(0));
    }

    @Test
    void fibonacci_sequence_48_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            fibonacciSeq(48);
        });

        String expectedMessage = "Error: Range for n is 0 to 47.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
