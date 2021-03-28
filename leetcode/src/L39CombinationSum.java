import java.util.*;

public class L39CombinationSum {

    static class V1 {
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            dfs(candidates, 0, target, new ArrayDeque<>(), result);
            return result;
        }


        private static void dfs(int[] candidates, int index, int target,
                                Deque<Integer> path, List<List<Integer>> result) {

            if (index >= candidates.length) {
                if (target == 0) result.add(new ArrayList<>(path));
                return;
            }

            for (int i = 0; i * candidates[index] <= target; i++) {
                path.addAll(Collections.nCopies(i, candidates[index]));
                dfs(candidates, index + 1, target - (i * candidates[index]), path, result);
                for (int j = 0; j < i; j++) {
                    path.removeLast();
                }
            }
        }
    }


    static class V2 {
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);
            combinationSum(candidates, 0, target, new ArrayDeque<>(), result);
            return result;
        }

        private static void combinationSum(int[] candidates, int index, int target,
                                            Deque<Integer> path, List<List<Integer>> result) {

            if (target == 0) {
                result.add(new ArrayList<>(path));
            }

            for (int i = index; i < candidates.length; i++) {
                int c = candidates[i];
                if (c > target) break;
                path.addLast(c);
                combinationSum(candidates, i, target - c, path, result);
                path.removeLast();
            }
        }
    }


}
