import ds.TreeNode;

public class L124MaxPathSum {


    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    // 返回 以root为起点的最大路径的值
    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);

        max = Math.max(max, left + right + root.val);

        return root.val + Math.max(left, right);
    }

}
