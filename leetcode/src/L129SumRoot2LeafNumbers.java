import ds.TreeNode;


public class L129SumRoot2LeafNumbers {

    public int sumNumbers(TreeNode root) {
        dfs(root, new StringBuilder());
        return sum ;
    }

    private int sum;

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val);

        if (root.left == null && root.right == null) {
            sum += Integer.valueOf(sb.toString());
        } else {
            dfs(root.left, sb);
            dfs(root.right, sb);
        }

        sb.setLength(sb.length()-1);
    }




}
