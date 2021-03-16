import org.junit.Test;

import static org.junit.Assert.*;

public class L53MaximumSubarrayTest {

    @Test
    public void maxSubArray1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, L53MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void maxSubArray2() {
        int[] nums = {1};
        assertEquals(1, L53MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void maxSubArray3() {
        int[] nums = {5, 4, -1, 7, 8};
        assertEquals(23, L53MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void maxSubArray4() {
        int[] nums = {-9, -8, -7};
        assertEquals(-7, L53MaximumSubarray.maxSubArray(nums));
    }

}