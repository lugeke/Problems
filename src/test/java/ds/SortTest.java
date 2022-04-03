package ds;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SortTest {

    @Test
    @Parameters(method = "getData")
    public void testMergeSort(int[] unsorted, int[] sorted) {

        MergeSort.mergeSort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }

    @Test
    @Parameters(method = "getData")
    public void testQuickSort(int[] unsorted, int[] sorted) {

        QuickSort.sort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }

    private static List<Object[]> getData() {

        int nums = 10;
        int[] sorted = IntStream.range(0, nums).toArray();

        List<Object[]> collect = IntStream.range(0, 100).mapToObj(i -> {
            int[] ary = Arrays.copyOf(sorted, sorted.length);
            Utils.shuffleArray(ary);
            return new Object[]{ary, sorted};

        }).collect(Collectors.toList());

        collect.add(new Object[]{Arrays.copyOf(sorted, sorted.length), sorted});

        return collect;
    }


}