package general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

class Fibonacci_02_SeqBigInteger_Test {

    private final List<BigInteger> expected1 = Arrays.asList(
            BigInteger.valueOf(0) );

    private final List<BigInteger> expected2 = Arrays.asList(
            BigInteger.valueOf(0),
            BigInteger.valueOf(1),
            BigInteger.valueOf(1),
            BigInteger.valueOf(2),
            BigInteger.valueOf(3),
            BigInteger.valueOf(5),
            BigInteger.valueOf(8),
            BigInteger.valueOf(13),
            BigInteger.valueOf(21),
            BigInteger.valueOf(34),
            BigInteger.valueOf(55),
            BigInteger.valueOf(89),
            BigInteger.valueOf(144),
            BigInteger.valueOf(233),
            BigInteger.valueOf(377),
            BigInteger.valueOf(610),
            BigInteger.valueOf(987),
            BigInteger.valueOf(1597),
            BigInteger.valueOf(2584),
            BigInteger.valueOf(4181),
            BigInteger.valueOf(6765),
            BigInteger.valueOf(10946),
            BigInteger.valueOf(17711),
            BigInteger.valueOf(28657),
            BigInteger.valueOf(46368),
            BigInteger.valueOf(75025),
            BigInteger.valueOf(121393),
            BigInteger.valueOf(196418),
            BigInteger.valueOf(317811),
            BigInteger.valueOf(514229),
            BigInteger.valueOf(832040),
            BigInteger.valueOf(1346269),
            BigInteger.valueOf(2178309),
            BigInteger.valueOf(3524578),
            BigInteger.valueOf(5702887),
            BigInteger.valueOf(9227465),
            BigInteger.valueOf(14930352),
            BigInteger.valueOf(24157817),
            BigInteger.valueOf(39088169),
            BigInteger.valueOf(63245986),
            BigInteger.valueOf(102334155),
            BigInteger.valueOf(165580141),
            BigInteger.valueOf(267914296),
            BigInteger.valueOf(433494437),
            BigInteger.valueOf(701408733),
            BigInteger.valueOf(1134903170),
            BigInteger.valueOf(1836311903),
            BigInteger.valueOf(2971215073L)
            );

    @Test
    void fibonacci_sequence_0() {
        Assertions.assertEquals(expected1, Fibonacci_02_SeqBigInteger.fibonacciSeqBigInt(0));
    }

    @Test
    void fibonacci_sequence_from_0_to_47() {
        Assertions.assertEquals(expected2, Fibonacci_02_SeqBigInteger.fibonacciSeqBigInt(47));
    }

    @Test
    void fibonacci_sequence_neg_one_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci_02_SeqBigInteger.fibonacciSeqBigInt(-1);
        });

        String expectedMessage = "n must not be less than zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
