import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class L78SubsetsTest {

    private static <E> void assertHashSetEquals(Collection<E> a, Collection<E> b) {
        assertEquals(new HashSet<>(a), new HashSet<>(b));
    }

    @Test
    public void subsets1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = L78Subsets.subsets(nums);

        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
                Arrays.asList(1, 2), Arrays.asList(1, 3), Arrays.asList(2, 3),
                Arrays.asList(1, 2, 3));

        assertHashSetEquals(result, subsets);
    }

    @Test
    public void subsets2() {
        int[] nums = {0};
        List<List<Integer>> subsets = L78Subsets.subsets(nums);

        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(0));

        assertHashSetEquals(result, subsets);
    }
}