import ds.TreeNode;

public class L98ValidateBinarySearchTree {

    private Integer pre;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) { return true; }

        if (!inorder(root.left)) { return false;}

        if (pre != null && pre >= root.val) { return false; }

        pre = root.val;

        return inorder(root.right);
    }
}
