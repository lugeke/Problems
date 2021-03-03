import ds.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class MergeKLists {


    public static ListNode mergeKLists(ArrayList<ListNode> lists) {

        lists.removeIf(Objects::isNull);

        if (lists.size() == 0) return null;

        ListNode min = lists.get(0);
        int index = 0;
        for (int i = 1; i < lists.size(); i++) {
            if (lists.get(i).data <= min.data) {
                min = lists.get(i);
                index = i;
            }
        }

        lists.set(index, min.next);
        min.next = mergeKLists(lists);

        return min;
    }

    public static ListNode mergeKListsPriorityQueue(ArrayList<ListNode> lists) {

        lists.removeIf(Objects::isNull);
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.size(), Comparator.comparingInt(n -> n.data));
        queue.addAll(lists);

        ListNode dummy = new ListNode(), tail = dummy;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            if (node.next != null) {
                queue.offer(node.next);
                node.next = null;
            }
            tail.next = node;
            tail = node;
        }

        return dummy.next;
    }

}
