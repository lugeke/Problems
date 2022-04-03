import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class L315CountofSmallerNumbersAfterSelf {

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>(nums.length);
        for (int i = nums.length-1 ; i >= 0; i--) {
            int n = nums[i], count = 0;
            for (int j= i+1 ;j < nums.length; j++)
                if (nums[j] < n) count++;

            result.add(count);
        }

        Collections.reverse(result);
        return result;
    }
}
