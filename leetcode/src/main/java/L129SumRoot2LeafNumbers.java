import ds.TreeNode;


public class L129SumRoot2LeafNumbers {

    public int sumNumbers(TreeNode root) {
        dfs(root);
        return sum ;
    }

    private int sum;
    // 根节点到当前节点到值
    private int current;

    private void dfs(TreeNode root) {
        if (root == null) return;
        current = current * 10 + root.val;

        if (root.left == null && root.right == null) {
            sum += current;
        } else {
            dfs(root.left);
            dfs(root.right);
        }
        current /= 10;
    }




}
