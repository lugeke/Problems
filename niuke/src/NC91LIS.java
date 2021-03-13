import java.util.Arrays;

public class NC91LIS {

    // https://leetcode.com/problems/longest-increasing-subsequence/solution/
    public static int[] LIS(int[] nums) {

        int[] dp = new int[nums.length];
        int[] maxLen = new int[nums.length]; // maxLen[i] 代表以nums[i]为最大值的子序列长度
        int max = 0; // 最长子序列最大值的下标
        int len = 0; // 最长子序列的长度

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int j = Arrays.binarySearch(dp, 0, len, num);
            if (j < 0) j = -(j + 1);
            // dp[0...j] 代表以nums[i]为最大值的子序列
            dp[j] = num;
            maxLen[i] = j + 1;
            if (j == len) {
                len++;
                max = i;
            }
            // 更新max为子序列中字典序较小的
            if (j == len - 1) {
                max = i;
            }
        }

        // 根据len, max, 和maxLen数组 构建最长子序列
        int[] result = new int[len];
        for (int i = max, l = len; i > -1; i--) {
            if (maxLen[i] == l) {
                result[--l] = nums[i];
            }
        }
        return result;
    }


}
