import ds.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L148SortList {

    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        List<ListNode> list = new ArrayList<>();

        for (ListNode n = head; n != null ; n = n.next) {
            list.add(n);
        }

        list.sort(Comparator.comparingInt(x -> x.val));

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i+1);
        }

        list.get(list.size()-1).next = null;

        return list.get(0);
    }


    // todo: 并排序可以做到空间复杂度为 O(1)

}
