import ds.TreeNode;

import java.util.*;

public class L199BinaryTreeRightSideView {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        // 层级遍历，每层的最后一个节点
        Queue<TreeNode> queue = new LinkedList<>(Collections.singleton(root));

        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode n = queue.remove();
                if (i == count - 1) list.add(n.val);
                if (n.left != null) queue.offer(n.left);
                if (n.right != null) queue.offer(n.right);
            }
        }
        return list;
    }
}
