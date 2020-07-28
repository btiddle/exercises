package test.java.com.btiddle;

import static main.java.com.btiddle.Fibonacci_04_Nth_Position_Recursive.fibonacciNth;
import static main.java.com.btiddle.Fibonacci_05_Nth_Position_Recursive_Cached.cachedFibN;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Fibonacci_05_Nth_Position_Recursive_Cache_Test {

//    private final List<Integer> expected = Arrays.asList(
//            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
//            144, 233, 377, 610, 987, 1597, 2584, 4181,
//            6765, 10946, 17711, 28657, 46368, 75025, 121393,
//            196418, 317811, 514229, 832040, 1346269, 2178309,
//            3524578, 5702887, 9227465, 14930352, 24157817,
//            39088169, 63245986, 102334155, 165580141, 267914296,
//            433494437, 701408733, 1134903170, 1836311903);

    @Test
    public void nonCached_vs_Cached() {
        final long nonCachedStart = System.nanoTime();
        assertEquals(1134903170, fibonacciNth(45));
        final long nonCachedFinish = System.nanoTime();
        assertEquals(1134903170, cachedFibN(45));
        final long cachedFinish = System.nanoTime();
        System.out.printf(
                "Non cached time: %d nanoseconds%n",
                nonCachedFinish - nonCachedStart);
        System.out.printf(
                "Cached time    : %d nanoseconds%n",
                cachedFinish - nonCachedFinish);
    }

    @Test
    void fibonacci_nth_0() {
        assertEquals(0, cachedFibN(0));
    }

    @Test
    void fibonacci_nth_1() {
        assertEquals(1, cachedFibN(1));
    }

    @Test
    void fibonacci_nth_2() {
        assertEquals(1, cachedFibN(2));
    }

    @Test
    void fibonacci_nth_3() {
        assertEquals(2, cachedFibN(3));
    }

    @Test
    void fibonacci_nth_46() {
        assertEquals(1836311903, cachedFibN(46));
    }

    @Test
    void fibonacci_nth_47_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cachedFibN(47);
        });

        String expectedMessage = "n must be in range 0 to 46";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void fibonacci_nth_neg_one_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cachedFibN(-1);
        });

        String expectedMessage = "n must be in range 0 to 46";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }



}