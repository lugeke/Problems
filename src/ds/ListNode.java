package ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode() {
    }

    public ListNode(List<Integer> list) {
        ListNode head = null;

        for(ListIterator<Integer> li = list.listIterator(list.size()); li.hasPrevious();)
            head = new ListNode(li.previous(), head);

        this.data = head.data;
        this.next = head.next;
    }

    public List<Integer> toList() {
        List<Integer> l = new ArrayList<>();
        l.add(data);
        for (ListNode n = next; n != null; n = n.next)
            l.add(n.data);
        return l;
    }

    public int getLength() {
        int len = 1;
        for(ListNode p = this.next; p != null; p = p.next) len++;

        return len;
    }

    public ListNode reverse() {
        ListNode h = new ListNode(data);
        for(ListNode p = this.next; p != null; p = p.next) {
            h = new  ListNode(p.data, h);
        }

        return h;
    }
}
