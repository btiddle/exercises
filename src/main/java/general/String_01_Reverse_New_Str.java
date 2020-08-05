/*
Title:
    Reverse String Using New String

Exercise:
    Write a method to reverse a String.

Insights:
    In Java, a String is immutable, so once it has been constructed it is not
    possible to change the contents. So when you are asked to reverse a
    String, you are actually being asked to produce a new String object,
    with the contents reversed.

    This approach, while fine, does require a large amount of memory. It
    needs to hold the original String and the StringBuilder in memory.
    This could be problematic if you were reversing some data of several
    gigabytes in size.
*/

package general;

import org.testng.SkipException;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class String_01_Reverse_New_Str {

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
