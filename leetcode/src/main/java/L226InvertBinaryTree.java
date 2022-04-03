import ds.TreeNode;

public class L226InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;
        TreeNode n = root.left;
        root.left = root.right;
        root.right = n;
        invertTree(root.left);
        invertTree(root.right);
        return root;

    }

}
