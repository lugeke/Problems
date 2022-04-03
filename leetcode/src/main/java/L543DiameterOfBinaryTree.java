import ds.TreeNode;

public class L543DiameterOfBinaryTree {

    private int max;

    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return max;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);

        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }

}
