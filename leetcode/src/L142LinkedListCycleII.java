import ds.ListNode;

public class L142LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        // one 每次走一步，two每次走两步
        ListNode one = head, two = head;

        while (two.next != null && two.next.next != null) {
            one = one.next;
            two = two.next.next;
            if (one == two) { // 相遇，证明有环
                ListNode p = head; //p从起点开始走，再次相遇点则为环的入口
                while (p != one) {
                    p = p.next;
                    one = one.next;
                }
                return p;
            }
        }
        return null;
    }

}
