import org.junit.Test;

import static org.junit.Assert.*;

public class L8String2IntegerTest {

    @Test
    public void myAtoi() {

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

        assertEquals(42, L8String2Integer.myAtoi("42"));
        assertEquals(42, L8String2Integer.myAtoi("+42"));
        assertEquals(42, L8String2Integer.myAtoi("+0042"));
        assertEquals(-42, L8String2Integer.myAtoi("    -42"));
        assertEquals(4193, L8String2Integer.myAtoi("4193 with words"));

        assertEquals(2147483647, L8String2Integer.myAtoi("2147483647"));
        assertEquals(2147483647, L8String2Integer.myAtoi("2147483648"));
        assertEquals(2147483647, L8String2Integer.myAtoi("012147483648"));

        assertEquals(-2147483648, L8String2Integer.myAtoi("-2147483648"));
        assertEquals(-2147483647, L8String2Integer.myAtoi("-2147483647"));
        assertEquals(-2147483648, L8String2Integer.myAtoi("-2147483649"));
        assertEquals(-2147483648, L8String2Integer.myAtoi("-12147483649"));

        assertEquals(0, L8String2Integer.myAtoi("00000-42a1234"));
        assertEquals(0, L8String2Integer.myAtoi(" "));
        assertEquals(0, L8String2Integer.myAtoi("  "));
        assertEquals(0, L8String2Integer.myAtoi("   "));

    }
}