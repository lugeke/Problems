package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PartitionTest {

    @Test
    public void partition() {
        ListNode head = new ListNode(Arrays.asList(3, 5, 8, 5, 10, 2, 1));
        head = Partition.partition(head, 5);
//        System.out.println(head.toList());
        assertTrue(isPartitioned(head, 5));

        head = new ListNode(Arrays.asList(3, 5, 8, 5, 10, 2, 1));
        head = Partition.partition(head, 1);
//        System.out.println(head.toList());
        assertTrue(isPartitioned(head, 1));

        head = new ListNode(Arrays.asList(3, 5, 8, 5, 10, 2, 1));
        head = Partition.partition(head, 8);
//        System.out.println(head.toList());
        assertTrue(isPartitioned(head, 8));

        head = new ListNode(Arrays.asList(3, 5, 8, 5, 10, 2, 1));
        head = Partition.partition(head, 10);
//        System.out.println(head.toList());
        assertTrue(isPartitioned(head, 10));

        head = new ListNode(Arrays.asList(3, 5, 8, 5, 10, 2, 1));
        head = Partition.partition(head, 0);
//        System.out.println(head.toList());
        assertTrue(isPartitioned(head, 0));
    }

    private boolean isPartitioned(ListNode head, int x) {
        boolean less = true;

        for (ListNode p = head; p != null; p = p.next) {
            if (less) {
                if (p.val >= x) less = false;
            } else {
                if (p.val < x) return false;
            }
        }

        return true;
    }
}