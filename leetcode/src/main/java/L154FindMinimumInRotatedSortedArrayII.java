public class L154FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length -1;
        if (nums[low] < nums[high] || nums.length == 1) return nums[low];

        while (low < high) {
            if (low + 1 == high) {
                return nums[high];
            }

            int mid = low + (high - low) / 2;

            if (nums[low] == nums[high] && nums[mid] == nums[low])
                return minInOrder(nums, low, high);

            if (nums[mid] >= nums[low]) low = mid;
            else if (nums[mid] <= nums[high]) high = mid;
        }

        throw new AssertionError("can't reach here");
    }

    private static int minInOrder(int[] nums, int low, int high) {
        int result = nums[low];
        for (int i = low+1; i <= high; i++) {
            result = Math.min(result, nums[i]);
        }
        return result;
    }
}
