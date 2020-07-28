/*
Title:
    Fibonacci Nth Position Iterative

Exercise:
    Return the fibonacci number at the specified index.
    For example, index = 4, should print "3" (i.e. 0, 1, 1, 2, 3).

Insights:
    Sequence begins with 0 and 1.

    Subsequent values are derived as sum of previous two values.

    Range of Java int is -2,147,483,648 .. 2,147,483,647.

    fibonacci(46) = 1,836,311,903 can be calculated using Java int.
    fibonacci(47) = 2,971,215,073 can not be calculated using Java int
    becasue it is out side the range for Java int. For values 47 and
    above, solution is to use the BigInteger data type.
*/

package main.java.com.btiddle;

public class Fibonacci_03_Nth_Position_Iterative {

    public static int fibonacci(int index) {
        if (index < 0 || index > 46)
            throw new IllegalArgumentException (
                    index + ": index must be in range 0 to 46"
            );

        if (index == 0)
            return 0;

        if (index == 1)
            return 1;

        // index == 2
        int fibonachi = 1;
        int fib1 = 1;
        int fib2 = 1;

        // index >= 3
        for (int i = 3; i <= index; i++) {
            fibonachi = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonachi;
        }
        return fibonachi;
    }
}

/*
For Fibonacci(0) ... Fibonacci(46)
    Fibonacci(0) = 0
    Fibonacci(1) = 1
    Fibonacci(2) = 1
    Fibonacci(3) = 2
    Fibonacci(4) = 3
    Fibonacci(5) = 5
    Fibonacci(6) = 8
    Fibonacci(7) = 13
    Fibonacci(8) = 21
    Fibonacci(9) = 34
    Fibonacci(10) = 55
    Fibonacci(11) = 89
    Fibonacci(12) = 144
    Fibonacci(13) = 233
    Fibonacci(14) = 377
    Fibonacci(15) = 610
    Fibonacci(16) = 987
    Fibonacci(17) = 1597
    Fibonacci(18) = 2584
    Fibonacci(19) = 4181
    Fibonacci(20) = 6765
    Fibonacci(21) = 10946
    Fibonacci(22) = 17711
    Fibonacci(23) = 28657
    Fibonacci(24) = 46368
    Fibonacci(25) = 75025
    Fibonacci(26) = 121393
    Fibonacci(27) = 196418
    Fibonacci(28) = 317811
    Fibonacci(29) = 514229
    Fibonacci(30) = 832040
    Fibonacci(31) = 1346269
    Fibonacci(32) = 2178309
    Fibonacci(33) = 3524578
    Fibonacci(34) = 5702887
    Fibonacci(35) = 9227465
    Fibonacci(36) = 14930352
    Fibonacci(37) = 24157817
    Fibonacci(38) = 39088169
    Fibonacci(39) = 63245986
    Fibonacci(40) = 102334155
    Fibonacci(41) = 165580141
    Fibonacci(42) = 267914296
    Fibonacci(43) = 433494437
    Fibonacci(44) = 701408733
    Fibonacci(45) = 1134903170
    Fibonacci(46) = 1836311903

When using Java int, for Fibonacci(47) an overflow condition occurs
    Fibonacci(47) = -1323752223

    So check if index > 46 and throw an exception
    Exception in thread "main" java.lang.IllegalArgumentException: 47: index can not be less than 0 or greater than 46
    	at Main.Fibonacci(Main.java:19)
 */
