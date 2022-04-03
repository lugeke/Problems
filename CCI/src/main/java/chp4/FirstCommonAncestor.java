package chp4;

import ds.TreeNode;

public class FirstCommonAncestor {

    boolean find = false;

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = lowestCommonAncestor1(root, p, q);
        return find ? node : null;
    }

    private TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        TreeNode l = lowestCommonAncestor1(root.left, p, q);
        if (find) return l;

        if (l != null && (root == p || root == q)) {
            find = true;
            return root;
        }

        TreeNode r = lowestCommonAncestor1(root.right, p, q);
        if (find) return r;
        if (r != null && (root == p || root == q)) {
            find = true;
            return root;
        }

        if (l != null && r != null) {
            find = true;
            return root;
        }

        if (root == p || root == q) return root;

        return l != null ? l : r;


    }
}
