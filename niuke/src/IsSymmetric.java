import ds.TreeNode;

public class IsSymmetric {

    public static boolean isSymmetric (TreeNode root) {

        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }


    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.data != right.data) return false;

        return isSymmetric(left.left, right.right) &&
                isSymmetric(left.right, right.left);
    }
}
