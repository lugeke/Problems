import java.util.Arrays;

public class L300LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {

        // lis is meant to store the increasing subsequence formed by including the currently encountered element
        int[] lis = new int[nums.length];
        // 0..<len is sorted
        int len = 0;
        for (int num : nums) {
            int index = Arrays.binarySearch(lis, 0, len, num);
            if (index < 0) {
                // 插入点
                index = -(index + 1);
                lis[index] = num;
                if (index == len) len++;
            }
        }
        return len;
    }

}
