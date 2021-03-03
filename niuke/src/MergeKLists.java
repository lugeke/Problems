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


    // 用分治法
    public static ListNode mergeKListsDC(ListNode[] lists) {
        return divideAndConquer(lists, 0, lists.length - 1);
    }

    private static ListNode divideAndConquer(ListNode[] lists, int start, int end) {
        if (start > end) return null;
        if (start == end) return lists[start];

        int mid = start + (end - start) / 2;

        ListNode la = divideAndConquer(lists, start, mid);
        ListNode lb = divideAndConquer(lists, mid + 1, end);
        return merge(la, lb);
    }

    private static ListNode merge(ListNode la, ListNode lb) {

        ListNode dummy = new ListNode(), tail = dummy;
        ListNode p = la, q = lb;
        while (p != null && q != null) {
            if (p.data < q.data) {
                tail.next = p;
                tail = p;
                p = p.next;
            } else {
                tail.next = q;
                tail = q;
                q = q.next;
            }
        }

        if ( p != null) tail.next = p;
        else tail.next = q;

        return dummy.next;
    }

}
