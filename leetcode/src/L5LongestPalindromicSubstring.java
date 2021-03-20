public class L5LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int start = 0, max = 1;

        for (int i = 0, m; i < chars.length; i++) {
            if ((m = expand(chars, i, i)) > max) {
                max = m;
                start = i - max / 2;
            }

            if ((m = expand(chars, i, i + 1)) > max) {
                max = m;
                start = i - max / 2 + 1;
            }
        }

        return s.substring(start, start + max);
    }


    private static int expand(char[] s, int i, int j) {

        for (; i > -1 && j < s.length; i--, j++) {
            if (s[i] != s[j]) break;
        }
        return j - i - 1;
    }


}
