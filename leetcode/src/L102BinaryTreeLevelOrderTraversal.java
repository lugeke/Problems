import ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L102BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelCount = 1;
        while (levelCount > 0) {
            int nextCount = 0;
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelCount; i++) {
                TreeNode n = queue.poll();
                level.add(n.val);
                if (n.left != null) {
                    queue.offer(n.left);
                    nextCount++;
                }
                if (n.right != null) {
                    queue.offer(n.right);
                    nextCount++;
                }
            }

            levels.add(level);
            levelCount = nextCount;
        }

        return levels;
    }


}
