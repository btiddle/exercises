package test.java.com.btiddle;

import static main.java.com.btiddle.Fibonacci_01_Seq.fibonacciSeq;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class Fibonacci_01_SeqTest {

    private final List<Integer> expected = Arrays.asList(
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
            144, 233, 377, 610, 987, 1597, 2584, 4181,
            6765, 10946, 17711, 28657, 46368, 75025, 121393,
            196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817,
            39088169, 63245986, 102334155, 165580141, 267914296,
            433494437, 701408733, 1134903170, 1836311903);

    @Test
    void fibonacci_sequence_from_0_to_46() {
        assertEquals(expected, fibonacciSeq(46));
    }

    @Test
    void fibonacci_sequence_from_0_to_46_Print() {
        for (int i = 0; i <= 46; i++) {
            System.out.println(fibonacciSeq(i));
        }
    }

    @Test
    void fibonacci_sequence_neg_one_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            fibonacciSeq(-1);
        });

        String expectedMessage = "Error: Range for n is 0 to 46.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void fibonacci_sequence_47_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            fibonacciSeq(47);
        });

        String expectedMessage = "Error: Range for n is 0 to 46.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
