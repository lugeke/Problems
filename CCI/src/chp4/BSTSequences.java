package chp4;

import ds.TreeNode;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class BSTSequences {

    List<List<Integer>> allSequences(TreeNode root) {
        allSequences(new HashSet<>(Collections.singleton(root)));
        return result;
    }

    private Deque<Integer> stack = new ArrayDeque<>();
    private List<List<Integer>> result = new ArrayList<>();

    private void allSequences(Set<TreeNode> level) {

        if (level.isEmpty()) {
            result.add(new ArrayList<>(stack));
        }

        TreeNode[] t = level.toArray(new TreeNode[0]);
        for (TreeNode node : t) {
            stack.addLast(node.val);
            level.remove(node);
            if (node.left != null) level.add(node.left);
            if (node.right != null) level.add(node.right);

            allSequences(level);

            level.add(node);
            if (node.left != null) level.remove(node.left);
            if (node.right != null) level.remove(node.right);
            stack.removeLast();
        }

    }
}

class BSTSequences1 {
    ArrayList<LinkedList<Integer>> allSequences(TreeNode node) {
        ArrayList<LinkedList<Integer>> result = new ArrayList<>();
        if (node == null) {
            result.add(new LinkedList<>());
            return result;
        }

        LinkedList<Integer> prefix = new LinkedList<>();
        prefix.add(node.val);
        /* Recurse on left and right subtrees. */
        ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.left);
        ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.right);
        /* Weave together each list from the left and right sides. */
        for (LinkedList<Integer> left : leftSeq) {
            for (LinkedList<Integer> right : rightSeq) {
                ArrayList<LinkedList<Integer>> weaved =
                        new ArrayList<>();
                weaveLists(left, right, weaved, prefix);
                result.addAll(weaved);
            }
        }
        return result;
    }

    private void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second,
                            ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {

        if (first.size() == 0 || second.size() == 0) {
            LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
            result.addAll(first);
            result.addAll(second);
            results.add(result);
            return;

        }

        int headFirst = first.removeFirst();
        prefix.addLast(headFirst);
        weaveLists(first, second, results, prefix);
        prefix.removeLast();
        first.addFirst(headFirst);

        int headSecond = second.removeFirst();
        prefix.addLast(headSecond);
        weaveLists(first, second, results, prefix);
        prefix.removeLast();
        second.addFirst(headSecond);

    }

}