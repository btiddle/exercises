package general;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Factorial_01_Iterative_Test {

    private final String expectedMessage = "n must be greater than zero";

    @Test
    void factorial_neg_one_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial_01_Iterative.factorial(-1);
        });

        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void factorial_zero_then_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial_01_Iterative.factorial(0);
        });

        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    public void factorial_1() {
        Assertions.assertEquals(1, Factorial_01_Iterative.factorial(1));
    }


    @Test
    public void factorial_2() {
        Assertions.assertEquals(2, Factorial_01_Iterative.factorial(2));
    }

    @Test
    public void factorial_3_to_20() {
        Assertions.assertEquals(6L, Factorial_01_Iterative.factorial(3) );
        Assertions.assertEquals(24L, Factorial_01_Iterative.factorial(4) );
        Assertions.assertEquals(120L, Factorial_01_Iterative.factorial(5) );
        Assertions.assertEquals(720L, Factorial_01_Iterative.factorial(6) );
        Assertions.assertEquals(5040L, Factorial_01_Iterative.factorial(7) );
        Assertions.assertEquals(40320L, Factorial_01_Iterative.factorial(8) );
        Assertions.assertEquals(362880L, Factorial_01_Iterative.factorial(9) );
        Assertions.assertEquals(3628800L, Factorial_01_Iterative.factorial(10));
        Assertions.assertEquals(39916800L, Factorial_01_Iterative.factorial(11));
        Assertions.assertEquals(479001600L, Factorial_01_Iterative.factorial(12));
        Assertions.assertEquals(6227020800L, Factorial_01_Iterative.factorial(13));
        Assertions.assertEquals(87178291200L, Factorial_01_Iterative.factorial(14));
        Assertions.assertEquals(1307674368000L, Factorial_01_Iterative.factorial(15));
        Assertions.assertEquals(20922789888000L, Factorial_01_Iterative.factorial(16));
        Assertions.assertEquals(355687428096000L, Factorial_01_Iterative.factorial(17));
        Assertions.assertEquals(6402373705728000L, Factorial_01_Iterative.factorial(18));
        Assertions.assertEquals(121645100408832000L, Factorial_01_Iterative.factorial(19));
        Assertions.assertEquals(2432902008176640000L, Factorial_01_Iterative.factorial(20));
    }

    @Test
    public void print_factorial_1_to_20() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("factorial(" + i + ") = " + Factorial_01_Iterative.factorial(i));
        }
    }
}


