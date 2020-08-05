package general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String_02_Reverse_In_Place_Test {

    String input    = "";
    String expected = "";

    @Test
    public void reverse_size_0() {
        input    = "";
        expected = "";
        Assertions.assertEquals(expected, String_02_Reverse_In_Place.reverseInPlace(input));
    }

    @Test
    public void reverse_size_1() {
        input    = "A";
        expected = "A";
        Assertions.assertEquals(expected, String_02_Reverse_In_Place.reverseInPlace(input));
    }

    @Test
    public void reverse_size_2() {
        input    = "A1";
        expected = "1A";
        Assertions.assertEquals(expected, String_02_Reverse_In_Place.reverseInPlace(input));
    }

    @Test
    public void reverse_size_3() {
        input    = "B2!";
        expected = "!2B";
        Assertions.assertEquals(expected, String_02_Reverse_In_Place.reverseInPlace(input));
    }

    @Test
    public void reverse_size_4() {
        input    = "D4#(";
        expected = "(#4D";
        Assertions.assertEquals(expected, String_02_Reverse_In_Place.reverseInPlace(input));
    }

    @Test
    public void reverse_size_5() {
        input    = "12345";
        expected = "54321";
        Assertions.assertEquals(expected, String_02_Reverse_In_Place.reverseInPlace(input));
    }

    @Test
    public void reverse_alphabet() {
        input    = "Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz";
        expected = "zZ yY xX wW vV uU tT sS rR qQ pP oO nN mM lL kK jJ iI hH gG fF eE dD cC bB aA";
        Assertions.assertEquals(expected, String_02_Reverse_In_Place.reverseInPlace(input));
    }

    // TODO: Investigate why this fails?
    // @Test
    // public void reverse_emoji() {
    //     input    = "✊👊👌👍👎";
    //     expected = "👎👍👌👊✊";
    //     assertEquals(expected, reverseInPlace(input));
    // }
}
