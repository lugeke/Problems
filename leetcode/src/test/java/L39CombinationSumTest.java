import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class L39CombinationSumTest {

    private static <E> void  assertHashSetEquals(Collection<E> a, Collection<E> b) {
        assertEquals(new HashSet<>(a), new HashSet<>(b));
    }

    @Test
    public void combinationSum1() {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(2, 2, 3),
                Arrays.asList(7)
        );
        assertHashSetEquals(result, L39CombinationSum.V1.combinationSum(candidates, 7));
        assertHashSetEquals(result, L39CombinationSum.V2.combinationSum(candidates, 7));
    }

    @Test
    public void combinationSum2() {
        int[] candidates = {2};
        List<List<Integer>> result = Collections.emptyList();
        assertHashSetEquals(result, L39CombinationSum.V1.combinationSum(candidates, 1));
        assertHashSetEquals(result, L39CombinationSum.V2.combinationSum(candidates, 1));
    }

    @Test
    public void combinationSum3() {
        int[] candidates = {1};
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(1)
        );
        assertHashSetEquals(result, L39CombinationSum.V1.combinationSum(candidates, 1));
        assertHashSetEquals(result, L39CombinationSum.V2.combinationSum(candidates, 1));
    }

    @Test
    public void combinationSum4() {
        int[] candidates = {1};
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(1, 1)
        );
        assertHashSetEquals(result, L39CombinationSum.V1.combinationSum(candidates, 2));
        assertHashSetEquals(result, L39CombinationSum.V2.combinationSum(candidates, 2));
    }

//    Input: candidates = [2,3,5], target = 8
//    Output: [[2,2,2,2],[2,3,3],[3,5]]

    @Test
    public void combinationSum5() {
        int[] candidates = {1};
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(1, 1)
        );
        assertHashSetEquals(result, L39CombinationSum.V1.combinationSum(candidates, 2));
        assertHashSetEquals(result, L39CombinationSum.V2.combinationSum(candidates, 2));
    }
}