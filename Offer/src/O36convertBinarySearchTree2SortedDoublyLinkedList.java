import ds.TreeNode;

public class O36convertBinarySearchTree2SortedDoublyLinkedList {


    TreeNode dummy = new TreeNode(0);
    TreeNode pre = dummy;

    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return null;
        inorder(root);
        pre.right = dummy.right;
        dummy.right.left = pre;

        return dummy.right;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        pre.right = root;
        root.left = pre;
        pre = root;

        inorder(root.right);
    }
}
