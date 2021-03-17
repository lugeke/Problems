import ds.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        // 构建标记结点, 指向根节点
        TreeNode curr = root;
        // 大循环
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

        return list;
    }


}
