import java.util.*;

public class L47PermutationsII {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        dfs(map, new ArrayDeque<>(nums.length), result, nums.length);
        return result;
    }


    private static void dfs(Map<Integer, Integer> map, Deque<Integer> perm, List<List<Integer>> result, int len) {

        if (perm.size() == len) {
            result.add(new ArrayList<>(perm));
            return;
        }

        for (Integer c : map.keySet()) {
            Integer count = map.get(c);
            if (count > 0) {
                perm.addLast(c);
                map.put(c, count - 1);

                dfs(map, perm, result, len);

                map.put(c, count);
                perm.removeLast();
            }
        }
    }


}
