import com.sun.istack.internal.NotNull;
import ds.TreeNode;

public class NC102LowestCommonAncestor {

    public static int lowestCommonAncestor(TreeNode root, int a, int b) {
        return find(root, a, b).val;
    }

    private static TreeNode find(TreeNode root, int a, int b) {
        if (root == null) return null;
        if (root.val == a || root.val == b) return root;
        TreeNode left = find(root.left, a, b);
        TreeNode right = find(root.right, a, b);

        if (left != null && right != null) return root;
        return left == null ? right : left;
    }


}
