import ds.TreeNode;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class L101SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public static boolean isSymmetricIterative(TreeNode root) {
        if (root == null) return true;
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while (!level.isEmpty()) {
            if (!isSymmetric(level)) return false;
            level = level.stream()
                    .flatMap(n -> n == null ? Stream.empty() : Stream.of(n.left, n.right))
                    .collect(toCollection(ArrayList::new));
        }

        return true;
    }

    private static boolean isSymmetric(List<TreeNode> l) {
        for (int i = 0, j = l.size() - 1; i < j; i++, j--) {
            TreeNode left = l.get(i), right = l.get(j);
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
        }
        return true;
    }
}
