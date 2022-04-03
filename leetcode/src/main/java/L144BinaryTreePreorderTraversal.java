import ds.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L144BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversal1(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                list.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop().right;
            }
        }

        return list;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return list;
    }


}
