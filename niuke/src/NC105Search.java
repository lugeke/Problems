public class NC105Search {

    public static int search (int[] nums, int target) {
        // write code here
        int index = -1;
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (nums[mid] == target) {
                // 在low 到 mid之间找第一个下标
                index = mid;
                high = mid-1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }

}
