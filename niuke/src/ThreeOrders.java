import ds.TreeNode;

import java.util.*;

public class ThreeOrders {

    public int[][] threeOrders(TreeNode root) {
        int[][] result = new int[3][];

        result[0] = preOrder(root);
        result[1] = inOrder(root);
        result[2] = postOrder(root);

        return result;
    }

    static int[] inOrder(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        // 构建标记结点, 指向根节点
        TreeNode curr = root;

        // 大循环:
        while (curr != null || !stack.isEmpty()){
            // 小循环
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            TreeNode pop = stack.pop();
            list.add(pop.val);
            curr = pop.right;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    static int[] preOrder(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        // 构建标记结点, 指向根节点
        TreeNode curr = root;

        // 大循环:
        while (curr != null || !stack.isEmpty()){
            // 小循环
            while (curr != null){
                stack.push(curr);
                list.add(curr.val);
                curr = curr.left;
            }

            TreeNode pop = stack.pop();
            curr = pop.right;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }


    static int[] postOrder(TreeNode root) {

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        // 1, 根入栈
        stack.push(root);

        // 2, 循环: 栈不空
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            // 头插法遍历
            deque.addFirst(pop.val);
            if (pop.left != null) stack.push(pop.left);
            if (pop.right != null) stack.push(pop.right);
        }

        return deque.stream().mapToInt(i -> i).toArray();
    }


}
