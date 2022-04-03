package chp4;

import ds.TreeNode;

public class CheckBalanced {

    private static final int UNBALANCED = -1;

    static boolean isBalanced(TreeNode root) {

        return getBalancedHeight(root) != UNBALANCED;
    }

    // if balanced, return root height, else -1
    private static int getBalancedHeight(TreeNode root) {
        if (root == null) return 0;

        int leftH = getBalancedHeight(root.left);
        if (leftH == UNBALANCED) return UNBALANCED;

        int rightH = getBalancedHeight(root.right);
        if (rightH == UNBALANCED) return UNBALANCED;

        if (Math.abs(leftH - rightH) > 1) return UNBALANCED;
        return Math.max(leftH, rightH) + 1;
    }
}
