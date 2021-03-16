import ds.ListNode;

public class L25ReverseNodesInkGroup {


    //先走k-1步，然后翻转当前k个节点的链表
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(), tail = dummy;
        ListNode p = head;

        outer:
        while (p != null) {

            ListNode h = p;
            // p先走k-1步
            for (int i = 0; i < k - 1; i++) {
                p = p.next;
                if (p == null) {
                    tail.next = h;
                    break outer;
                }
            }

            ListNode q = p.next;
            //将p（第K个节点）作为尾巴，然后翻转
            p.next = null;
            tail.next = reverse(h);
            tail = h;
            p = q;
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode h = null, p = head;
        while (p != null) {
            ListNode q = p.next;
            p.next = h;
            h = p;
            p = q;
        }
        return h;
    }

}
