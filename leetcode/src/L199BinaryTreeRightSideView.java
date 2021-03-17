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


    // 递归写法
    public List<Integer> rightSideView1(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        dfs(root, 0, list);
        return list;
    }

    private void dfs(TreeNode curr, int level, List<Integer> list) {
        if (level == list.size()) {
            list.add(curr.val);
        }

        if (curr.right != null) {
            dfs(curr.right, level + 1, list);
        }
        if (curr.left != null) {
            dfs(curr.left, level + 1, list);
        }
    }
}
