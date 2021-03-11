import com.sun.istack.internal.NotNull;
import ds.TreeNode;

public class NC102LowestCommonAncestor {

    public static int lowestCommonAncestor(TreeNode root, int a, int b) {
        ancestor = null;
        find(root, a, b);
        return ancestor.val;
    }

    private static TreeNode ancestor;

    // 找到任意一个即返回 true
    private static boolean find(@NotNull TreeNode root, int a, int b) {

        boolean findLeft = root.left != null && find(root.left, a, b);
        if (ancestor != null) return true;

        boolean rootMatch = root.val == a || root.val == b;
        if (findLeft && rootMatch) {
            ancestor = root;
            return true;
        }

        boolean findRight = root.right != null && find(root.right, a, b);

        if (rootMatch && findRight) ancestor = root;
        if (findLeft && findRight) ancestor = root;

        return findLeft || rootMatch || findRight;
    }


}
