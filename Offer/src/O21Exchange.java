import ds.Utils;

import static ds.Utils.swap;

public class O21Exchange {

    public int[] exchange(int[] nums) {
        int index = 0;
        // 0..<index 是奇数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                Utils.swap(nums, i, index++);
            }
        }

        return nums;
    }


}
