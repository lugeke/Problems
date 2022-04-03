import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class L46Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(Arrays.stream(nums).boxed().collect(Collectors.toList()), 0, result);
        return result;
    }

    private void permutation(List<Integer> list, int i, List<List<Integer>> result) {
        if (i == list.size()-1) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < list.size(); j++) {
            Collections.swap(list, j, i);
            permutation(list, i+1, result);
            Collections.swap(list, j, i);
        }
    }

}
