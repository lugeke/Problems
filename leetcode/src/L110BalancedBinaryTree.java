import ds.TreeNode;

public class L110BalancedBinaryTree {


    private static final int UNBALANCED = -1;

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != UNBALANCED;
    }

    int getHeight(TreeNode node) {
        if (node == null) return 0;

        int leftH = getHeight(node.left);
        if (leftH == UNBALANCED) return UNBALANCED;

        int rightH = getHeight(node.right);
        if (rightH == UNBALANCED) return UNBALANCED;

        if (Math.abs(leftH - rightH) > 1) return UNBALANCED;

        return Math.max(leftH, rightH) + 1;
    }


}
