/*
Title:
    Fibonacci Nth Position Recursive Cached

Exercise:
    Write a method that returns the nth value of the Fibonacci sequence.
    nth is zero based, i.e. Passing the value 0 would return 0;
    1 would return 1; 2 would return 1; and so on.

Hint:
    Sequence begins with 0 and 1.
    Subsequent values are derived as sum of previous two values.

    Because Java int range is (-2,147,483,648 .. 2,147,483,647)
    will need to use BigInteger to go beyond 47th position.

    By caching any calculated results, only unknown Fibonacci
    numbers would be calculated on a particular run. The
    results are  stored locally in a map.

    Non cached time: 5086465610 nanoseconds
    Cached time    : 430109 nanoseconds

    5 seconds vs 0.000430 sseconds
*/

package main.java.com.btiddle;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci_04_Nth_Position_Recursive_Cached {

    private static Map<Integer, Integer> fibCache = new HashMap<>();

    public static int cachedFibN(int n) {
        if (n < 0 || n > 46) {
            throw new IllegalArgumentException(
                    "n must be in range 0 to 46");
        }
        fibCache.put(0, 0);
        fibCache.put(1, 1);
        return recursiveCachedFibN(n);
    }

    private static int recursiveCachedFibN(int n) {
        if (fibCache.containsKey(n)) {
            return fibCache.get(n);
        }
        int value = recursiveCachedFibN(n - 1) + recursiveCachedFibN(n - 2);
        fibCache.put(n, value);
        return value;
    }
}
