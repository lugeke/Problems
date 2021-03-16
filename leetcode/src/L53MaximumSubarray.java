public class L53MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        // 以i为结尾的最大值
        int curMax = nums[0];
        int max = curMax;

        for (int i = 1; i < nums.length; i++) {
            if (curMax > 0)
                curMax += nums[i];
            else
                curMax = nums[i];

            max = Math.max(max, curMax);
        }
        return max;
    }


}
