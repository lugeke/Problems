package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }

    public ListNode(List<Integer> list) {
        ListNode head = null;

        for(ListIterator<Integer> li = list.listIterator(list.size()); li.hasPrevious();)
            head = new ListNode(li.previous(), head);

        this.val = head.val;
        this.next = head.next;
    }

    public List<Integer> toList() {
        List<Integer> l = new ArrayList<>();
        l.add(val);
        for (ListNode n = next; n != null; n = n.next)
            l.add(n.val);
        return l;
    }

    public int getLength() {
        int len = 1;
        for(ListNode p = this.next; p != null; p = p.next) len++;

        return len;
    }

    public ListNode reverse() {
        ListNode h = new ListNode(val);
        for(ListNode p = this.next; p != null; p = p.next) {
            h = new  ListNode(p.val, h);
        }

        return h;
    }
}
