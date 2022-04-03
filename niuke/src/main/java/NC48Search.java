

public class NC48Search {


    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) return mid;

            // Left half of the array(low...mid) is sorted
            if (nums[low] <= nums[mid]) {
                if (target < nums[low] || target > nums[mid])
                    low = mid + 1;
                 else
                    high = mid - 1;
            } else { // Right half of the array(mid+1...high) is sorted
                if (target < nums[mid] || target > nums[high])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }


}
