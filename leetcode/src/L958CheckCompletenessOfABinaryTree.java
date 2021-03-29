import ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class L958CheckCompletenessOfABinaryTree {

    public static boolean isCompleteTree(TreeNode root) {

        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelCount = 1;
        boolean isLastLevel = false;

        while (levelCount > 0) {
            int count = 0;
            for (int i = 0; i < levelCount; i++) {
                TreeNode n = queue.poll();
                if (isLastLevel && n != null) return false;
                if (n == null) isLastLevel = true;
                else {
                    queue.offer(n.left);
                    queue.offer(n.right);
                    count += 2;
                }
            }
            levelCount = count;
        }

        return true;
    }
}
