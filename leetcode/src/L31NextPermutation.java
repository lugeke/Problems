public class L31NextPermutation {

    public static void nextPermutation(int[] nums) {

        // nums[i+1..<nums.length]是递增子序列
        int i;
        for (i = nums.length - 2; i > -1; i--) {
            if (nums[i] < nums[i + 1]) break;
        }
        if (i == -1) reverse(nums, 0, nums.length - 1);
        else {

            // nums[k] 为第一个比nums[i] 大的元素
            // i 和 nums.length - 1
            int k = nums.length - 1;
            while (nums[k] <= nums[i]) k--;

            swap(nums, i, k);
            reverse(nums, i + 1, nums.length - 1);
        }


    }


    private static void reverse(int[] ary, int i, int j) {
        for (int start = i, end = j; start < end; start++, end--) {
            swap(ary, start, end);
        }
    }

    private static void swap(int[] ary, int i, int j) {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
}
