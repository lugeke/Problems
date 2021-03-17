import java.util.HashMap;
import java.util.Map;

public class L1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // 值，下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            Integer index = map.get(t);
            if (index != null) {
                return new int[]{index, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

}
