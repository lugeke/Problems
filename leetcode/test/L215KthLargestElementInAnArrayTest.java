import org.junit.Test;

import static org.junit.Assert.*;

public class L215KthLargestElementInAnArrayTest {

    @Test
    public void findKthLargest() {

        for (int i = 0; i < 100; i++) {
            int[] nums = {3, 2, 1, 5, 6, 4};
            int kthLargest = L215KthLargestElementInAnArray.findKthLargest(nums, 2);

            assertEquals(5, kthLargest);
        }

    }

    @Test
    public void findKthLargest1() {
        for (int i = 0; i < 100; i++) {
            int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
            int kthLargest = L215KthLargestElementInAnArray.findKthLargest(nums, 4);

            assertEquals(4, kthLargest);
        }

    }
}