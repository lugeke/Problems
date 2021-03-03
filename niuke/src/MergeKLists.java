import ds.ListNode;

import java.util.ArrayList;
import java.util.Objects;

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

}
