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

package general;

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
        int fibonacci = 1;

        // index >= 3
        int fib1 = 1;
        int fib2 = 1;
        for (int i = 3; i <= index; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }
}

/*
For fibonacci(0) ... fibonacci(46)
    fibonacci(0) = 0
    fibonacci(1) = 1
    fibonacci(2) = 1
    fibonacci(3) = 2
    fibonacci(4) = 3
    fibonacci(5) = 5
    fibonacci(6) = 8
    fibonacci(7) = 13
    fibonacci(8) = 21
    fibonacci(9) = 34
    fibonacci(10) = 55
    fibonacci(11) = 89
    fibonacci(12) = 144
    fibonacci(13) = 233
    fibonacci(14) = 377
    fibonacci(15) = 610
    fibonacci(16) = 987
    fibonacci(17) = 1597
    fibonacci(18) = 2584
    fibonacci(19) = 4181
    fibonacci(20) = 6765
    fibonacci(21) = 10946
    fibonacci(22) = 17711
    fibonacci(23) = 28657
    fibonacci(24) = 46368
    fibonacci(25) = 75025
    fibonacci(26) = 121393
    fibonacci(27) = 196418
    fibonacci(28) = 317811
    fibonacci(29) = 514229
    fibonacci(30) = 832040
    fibonacci(31) = 1346269
    fibonacci(32) = 2178309
    fibonacci(33) = 3524578
    fibonacci(34) = 5702887
    fibonacci(35) = 9227465
    fibonacci(36) = 14930352
    fibonacci(37) = 24157817
    fibonacci(38) = 39088169
    fibonacci(39) = 63245986
    fibonacci(40) = 102334155
    fibonacci(41) = 165580141
    fibonacci(42) = 267914296
    fibonacci(43) = 433494437
    fibonacci(44) = 701408733
    fibonacci(45) = 1134903170
    fibonacci(46) = 1836311903

When using Java int, for fibonacci(47), an overflow condition occurs
    fibonacci(47) = -1323752223

    So check if index > 46 and throw an exception
    Exception in thread "main" java.lang.IllegalArgumentException: 47: index can not be less than 0 or greater than 46
    	at Main.Fibonacci(Main.java:19)
 */
