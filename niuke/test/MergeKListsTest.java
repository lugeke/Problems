import ds.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class MergeKListsTest {

    @Test
    public void mergeKLists() {


        ArrayList<ListNode> lists = new ArrayList<>();

        lists.add(new ListNode(Arrays.asList(1, 4, 5, 10)));
        lists.add(new ListNode(Arrays.asList(2)));
        lists.add(new ListNode(Arrays.asList(3, 6, 7)));
        lists.add(new ListNode(Arrays.asList(8, 9)));

        List<Integer> result = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        assertEquals(result, MergeKLists.mergeKLists(lists).toList());

    }
}