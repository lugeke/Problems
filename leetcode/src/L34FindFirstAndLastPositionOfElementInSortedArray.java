import java.util.Arrays;

public class L34FindFirstAndLastPositionOfElementInSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1};

        int left = binarySearch(nums, target, 0, nums.length - 1, true);
        int right = binarySearch(nums, target, 0, nums.length - 1, false);

        return new int[]{left, right};
    }

    // 找到target的最左或最右下标
    private static int binarySearch(int[] nums, int target, int start, int end, boolean left) {
        if (start > end) return -1;
        int i = Arrays.binarySearch(nums, start, end + 1, target);
        if (i < 0) return -1;

        if (left) {
            int l = binarySearch(nums, target, start, i - 1, true);
            if (l < 0) l = i;
            return l;

        } else {
            int r = binarySearch(nums, target, i + 1, end, false);
            if (r < 0) r = i;
            return r;
        }
    }


}
