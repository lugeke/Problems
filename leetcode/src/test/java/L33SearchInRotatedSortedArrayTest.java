import org.junit.Test;

import static org.junit.Assert.*;

public class L33SearchInRotatedSortedArrayTest {

    @Test
    public void search1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = L33SearchInRotatedSortedArray.search(nums, 0);
        assertEquals(4, result);
    }

    @Test
    public void search2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = L33SearchInRotatedSortedArray.search(nums, 3);
        assertEquals(-1, result);
    }


    @Test
    public void search3() {
        int[] nums = { 1};
        int result = L33SearchInRotatedSortedArray.search(nums, 0);
        assertEquals(-1, result);
    }

//    Example 1:
//
//    Input: nums = [4,5,6,7,0,1,2], target = 0
//    Output: 4
//    Example 2:
//
//    Input: nums = [4,5,6,7,0,1,2], target = 3
//    Output: -1
//    Example 3:
//
//    Input: nums = [1], target = 0
//    Output: -1
}