import java.util.ArrayList;
import java.util.List;

public class L78Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int count = (int) Math.pow(2, nums.length);
        for (int i = 0; i < count; i++) {
            int bit = 1;
            List<Integer> set = new ArrayList<>();
            for (int j = 1; j < nums.length + 1; j++) {
                if ((bit & i) != 0) set.add(nums[j-1]);
                bit <<= 1;
            }
            result.add(set);
        }

        return result;
    }

}
