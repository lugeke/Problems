import ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

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

class IsSymmetricIterative {
    public static boolean isSymmetric (TreeNode root) {

        if (root == null) return true;

        List<TreeNode> level = new ArrayList<>();
        level.add(root);

        while (!level.isEmpty()) {

            List<TreeNode> next = new ArrayList<>();
            for (TreeNode n: level) {
                if (n != null) {
                    next.add(n.left);
                    next.add(n.right);
                }
            }
            level = next;

            if (!checkLevel(level)) return false;
        }
        return true;
    }

    private static boolean checkLevel(List<TreeNode> level) {
        for (int i = 0, j = level.size()-1; i < j; i++, j--) {
            TreeNode m = level.get(i);
            TreeNode n = level.get(j);
            if (m == null && n == null) continue;
            if (m == null || n == null) return false;
            if (m.data != n.data) return false;
        }
        return true;
    }
}