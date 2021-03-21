public class L8String2Integer {

//    The algorithm for myAtoi(string s) is as follows:
//
//    1. Read in and ignore any leading whitespace.

//    2. Check if the next character (if not already at the end of the string) is '-' or '+'.
//            Read this character in if it is either.
//            This determines if the final result is negative or positive respectively.
//            Assume the result is positive if neither is present.

//    3. Read in next the characters until the next non-digit charcter or the end of the input is reached.
//    The rest of the string is ignored.

//    4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
//    If no digits were read, then the integer is 0.
//    Change the sign as necessary (from step 2).

//    5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
//    then clamp the integer so that it remains in the range.
//    Specifically, integers less than -231 should be clamped to -231,
//    and integers greater than 231 - 1 should be clamped to 231 - 1.

//    6. Return the integer as the final result.
    public static int myAtoi1(String s) {

        char[] chars = s.toCharArray();
        boolean isPositive = true;
        int state = 1;
//        StringBuilder result = new StringBuilder();
        int start = 0, i;
        outer:
        for (i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (state) {
                case 1:
                    if (c != ' ') {
                        i--;
                        state = 2;
                    }
                    break;
                case 2:
                    if (c == '-') {
                        isPositive = false;
                    } else if (c != '+') {
                        i--;
                    }
                    state = 3;
                    start = i + 1;
                    break;
                case 3:
                    if (!Character.isDigit(c))
                        break outer;
                    break;
            }
        }

        if (state < 3) return 0;

        for (; start < i; start++) {
            if (chars[start] != '0') break;
        }

        String num = s.substring(start, i);
        if (num.isEmpty()) return 0;
        if (!isPositive) num = "-" + num;
        return clamp(num, isPositive);
    }

    private static int clamp(String number, boolean isPositive) {
        String max = String.valueOf(Integer.MAX_VALUE);
        if (!isPositive) {
            max = String.valueOf(Integer.MIN_VALUE);
        }
        if (number.length() > max.length() || (number.length() == max.length()
                && number.compareTo(max) > 0)) {
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            return Integer.valueOf(number);
        }
    }


    public static int myAtoi(String str) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (str.length() == 0) return 0;

        //Discard whitespaces in the beginning
        while (i < str.length() && str.charAt(i) == ' ')
            i++;

        // Check if optional sign if it exists
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
            sign = (str.charAt(i++) == '-') ? -1 : 1;

        // Build the result and check for overflow/underflow condition
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;

    }


}
