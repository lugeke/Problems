import org.junit.Test;

import static org.junit.Assert.*;

public class L34FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void searchRange1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] range = L34FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, 8);
        assertArrayEquals(new int[]{3, 4}, range);
    }

    @Test
    public void searchRange2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] range = L34FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, 6);
        assertArrayEquals(new int[]{-1, -1}, range);
    }

    @Test
    public void searchRange3() {
        int[] nums = {};
        int[] range = L34FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, 6);
        assertArrayEquals(new int[]{-1, -1}, range);
    }

    @Test
    public void searchRange4() {
        int[] nums = {1, 1, 1, 1, 1, 1};
        int[] range = L34FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, 1);
        assertArrayEquals(new int[]{0, 5}, range);
    }
}