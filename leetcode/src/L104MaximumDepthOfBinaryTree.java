import ds.TreeNode;

public class L104MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        return getHeight(root);
    }


    private static int getHeight(TreeNode root) {
        if (root == null) return 0;

        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);

        return Math.max(leftH, rightH) + 1;
    }

}
