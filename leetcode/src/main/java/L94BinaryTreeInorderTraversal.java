import ds.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L94BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal1(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
        }

        return list;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) stack.push(root);
        boolean pushMode = true;
        while (!stack.isEmpty()) {
            if (pushMode) {
                while (stack.peek().left != null)
                    stack.push(stack.peek().left);
                pushMode = false;
            }else {
                TreeNode node = stack.pop();
                list.add(node.val);
                if (node.right != null) {
                    stack.push(node.right);
                    pushMode = true;
                }
            }

        }

        return list;
    }


}
