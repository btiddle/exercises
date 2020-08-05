/*
Title:
    Reverse String In Place

Exercise:
    Write a method to reverse a String.

Insights:
    In Java, a String is immutable, so once it has been constructed it is not
    possible to change the contents. So when you are asked to reverse a
    String, you are actually being asked to produce a new String object,
    with the contents reversed.

    It is possible to reverse the String in place, by loading the whole String
    instance into a StringBuilder, traversing the characters from one end, and
    swapping with the character the same length away from the other end of the
    String. This only requires one extra character of memory to facilitate the
    swapping of characters.
*/

package general;

import org.testng.SkipException;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class String_02_Reverse_In_Place {

    public static String reverseInPlace (String input) {
        StringBuilder builder = new StringBuilder (input);
        int length = builder.length();
        for (int frontPosition = 0; frontPosition < length / 2; frontPosition++) {
            final char frontChar = builder.charAt(frontPosition);
            final int endPostion = length - 1 - frontPosition;
            builder.setCharAt(frontPosition, builder.charAt(endPostion));
            builder.setCharAt(endPostion, frontChar);
        }
        return builder.toString();
    }

    @Test
    public void size_0() {
        assertEquals (reverseInPlace(""), "");
    }

    @Test
    public void size_1() {
        assertEquals (reverseInPlace("1"), "1");
    }

    @Test
    public void size_2() {
        assertEquals (reverseInPlace("12"), "21");
    }

    @Test
    public void size_3() {
        assertEquals (reverseInPlace("123"), "321");
    }


    @Test
    public void size_4() {
        assertEquals (reverseInPlace("4321"), "1234");
    }

    @Test
    public void size_5() {
        assertEquals (reverseInPlace("54321"), "12345");

    }

    // Todo: null

    // Todo: ascii chart

    // Todo: unicode characters

    // Todo: words separated by variable spaces

    // Todo: words separated by variable tabs
}
