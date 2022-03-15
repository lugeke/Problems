import ds.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class L5LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome1() {
        assertEquals("bab", L5LongestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", L5LongestPalindromicSubstring.longestPalindrome("cbbd"));
        assertEquals("a", L5LongestPalindromicSubstring.longestPalindrome("a"));
        assertEquals("a", L5LongestPalindromicSubstring.longestPalindrome("ac"));


    }


    static class Hello {
        public static void main(String[] args) {
            ListNode l = null;
            System.out.println(l);
        }
    }
}