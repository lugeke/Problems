package chp4;

import ds.TreeNode;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class BSTSequences {

    List<List<Integer>> allSequences(TreeNode root) {
        allSequences(Collections.singleton(root));
        return result;
    }

    private Deque<TreeNode> stack = new ArrayDeque<>();

    private List<List<Integer>> result = new ArrayList<>();

    private void allSequences(Set<TreeNode> level) {

        if (level.isEmpty()) {
            result.add(stack.stream().map(n -> n.data).collect(toList()));
        }

        for (TreeNode node : level) {
            stack.addLast(node);
            Set<TreeNode> next = new HashSet<>(level);
            next.remove(node);

            if (node.left != null) next.add(node.left);
            if (node.right != null) next.add(node.right);

            allSequences(next);
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
        prefix.add(node.data);
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