import ds.ListNode;

public class O5PrintListReversingly {

    public static void print(ListNode head) {
        if (head != null) {
            print(head.next);
            System.out.println(head.getVal());
        }
    }
}
