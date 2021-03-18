import ds.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L113PathSumII {

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        dfs(root, targetSum, new ArrayDeque<>(), result);
        return result;
    }

    private static void dfs(TreeNode root, int sum, Deque<Integer> path, List<List<Integer>> result) {
        if (root == null) return;

        path.addLast(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            result.add(new ArrayList<>(path));
        }
        dfs(root.left, sum, path, result);
        dfs(root.right, sum, path, result);
        path.removeLast();
    }


}
