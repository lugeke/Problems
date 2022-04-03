import ds.ListNode;

import java.util.*;

public class L23MergeKSortedLists {

    //  O(Nlogk)
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> Alists = new ArrayList<>(lists.length);

        for (ListNode l: lists) if (l != null) Alists.add(l);
        if (Alists.size() == 0) return null;

        return mergeKLists(Alists);
    }

    // 用最小堆来存储列表头
    private static ListNode mergeKLists(List<ListNode> lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.size(), Comparator.comparingInt(n -> n.val));
        queue.addAll(lists);

        ListNode dummy = new ListNode(), tail = dummy;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            if (node.next != null) {
                queue.offer(node.next);
            }
            tail.next = node;
            tail = node;
        }
        tail.next = null;
        return dummy.next;
    }

}

class L23MergeKSortedLists1 {

    // 用分治法 O(Nlogk)
    public ListNode mergeKLists(ListNode[] lists) {
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
            if (p.val < q.val) {
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
