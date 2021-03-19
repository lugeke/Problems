import org.junit.Test;

import static org.junit.Assert.*;

public class L300LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = L300LongestIncreasingSubsequence.lengthOfLIS(nums);
        assertEquals(4, result);
    }

    @Test
    public void lengthOfLIS2() {
        int[] nums = {0, 1, 0, 3, 2, 3};
        int result = L300LongestIncreasingSubsequence.lengthOfLIS(nums);
        assertEquals(4, result);
    }

    @Test
    public void lengthOfLIS3() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        int result = L300LongestIncreasingSubsequence.lengthOfLIS(nums);
        assertEquals(1, result);
    }


}