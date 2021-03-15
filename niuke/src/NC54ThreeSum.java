import java.util.ArrayList;
import java.util.Arrays;

public class NC54ThreeSum {

    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // 先排序，后用双指针
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            // Don't allow `i` to point to same element
            if (i != 0 && num[i] == num[i - 1]) continue;

            int j = i + 1;
            int k = num.length - 1;
            while (j < k) {
                int sum = num[i] + num[j] + num[k];
                if (sum == 0) {
                    result.add(new ArrayList<>(Arrays.asList(num[i], num[j], num[k])));
                    j += 1;
                    // Don't allow `j` to point to same element
                    while (j < k && num[j] == num[j - 1]) {
                        j += 1;
                    }
                } else if (sum < 0) {
                    j += 1;
                } else {
                    k -= 1;
                }
            }
        }

        return result;
    }

}
