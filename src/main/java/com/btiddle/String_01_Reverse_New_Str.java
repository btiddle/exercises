/*
Title:
    Reverse String Using New String

Exercise:
    Write a method to reverse a String.

Insights:
    In Java, a String is immutable, so once it has been constructed it is not
    possible to change the contents. So when you are asked to reverse a
    String, you are actually being asked to produce a new String object,
    with the contents reversed:
*/

package main.java.com.btiddle;

public class String_01_Reverse_New_Str {

    public static String reverseNewStr(String s) {
        final StringBuilder builder = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
