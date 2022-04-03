import ds.Holder;
import ds.TreeNode;

public class O27ConvertBinarySearchTree2DoubleLinkedList {

    public static TreeNode convert(TreeNode root) {
        if (root == null) return null;

        TreeNode head = new TreeNode(0);
        final Holder<TreeNode> holder = new Holder<>(head);

        root.inOrder( node -> {
            TreeNode last = holder.getObject();
            node.left = last;
            last.right = node;
            holder.setObject(node);
        });

        // help gc
        head.right.left = null;

        return head.right;
    }


}
