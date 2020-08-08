/*
Title:
    Reverse String In Place

Exercise:
    Write a method to reverse a String.

Insights:
    Java Strings are immutable. To reverse a String, you have to produce a new
    String object, with the contents reversed.

    One approach to reversing a String is to iterate over the contents in
    reverse, populating a new container such as a StringBuilder as you go.

    This approach, while fine, does require a large amount of memory. It
    needs to hold the original String and the StringBuilder in memory.
    This could be problematic if you were reversing some data of several
    gigabytes in size.

    It is possible to reverse the String in place, by loading the whole String
    instance into a StringBuilder, traversing the characters from one end, and
    swapping with the character the same length away from the other end of the
    String. This only requires one extra character of memory to facilitate the
    swapping of characters.
*/

package general;

public class String_02_Reverse_Str_In_Place {

    public static String reverseInPlace (final String input) {
        final StringBuilder builder = new StringBuilder (input);
        int length = builder.length();
        for (int frontPosition = 0; frontPosition < length / 2; frontPosition++) {
            final char frontChar = builder.charAt(frontPosition);
            final int endPostion = length - 1 - frontPosition;
            builder.setCharAt(frontPosition, builder.charAt(endPostion));
            builder.setCharAt(endPostion, frontChar);
        }
        return builder.toString();
    }
}
