public class L33SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            // 左半部分有序 low...mid
            if (nums[mid] >= nums[low]) {
                if (target > nums[mid] || target < nums[low]) low = mid + 1;
                else high = mid - 1;
            } else { // mid + 1 ... high 有序
                if (target < nums[mid] || target > nums[high]) high = mid - 1;
                else low = mid + 1;
            }
        }
        return -1;
    }


}
