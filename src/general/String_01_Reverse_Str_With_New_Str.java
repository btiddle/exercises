/*
Title:
    Reverse String Using New String

Exercise:
    Write a method to reverse a String.

Insights:
    Java Strings are immutable. To reverse a String, you have to produce a new
    String object, with the contents reversed.

    One approach to reversing a String is to iterate over the contents in
    reverse, populating a new container such as a StringBuilder as you go.
*/

package general;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class String_01_Reverse_Str_With_New_Str {

    public static String reverseNewStr(final String s) {
        final StringBuilder builder = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    @Test
    public void size_0() {
        assertEquals (reverseNewStr(""), "");
    }

    @Test
    public void size_1() {
        assertEquals (reverseNewStr("1"), "1");
    }

    @Test
    public void size_2() {
        assertEquals (reverseNewStr("12"), "21");
    }

    @Test
    public void size_3() {
        assertEquals (reverseNewStr("123"), "321");
    }


    @Test
    public void size_4() {
        assertEquals (reverseNewStr("4321"), "1234");
    }

    @Test
    public void size_5() {
        assertEquals (reverseNewStr("54321"), "12345");

    }

    // Todo: null

    // Todo: ascii chart

    // Todo: unicode characters

    // Todo: words separated by variable spaces

    // Todo: words separated by variable tabs
}
