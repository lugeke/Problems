import org.junit.Test;

import static org.junit.Assert.*;

public class L1143LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequence() {

        assertEquals(3, L1143LongestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
        assertEquals(3, L1143LongestCommonSubsequence.longestCommonSubsequence("abc", "abc"));
        assertEquals(0, L1143LongestCommonSubsequence.longestCommonSubsequence("abc", "def"));

        assertEquals(1, L1143LongestCommonSubsequence.longestCommonSubsequence("abcd", "def"));

    }
}