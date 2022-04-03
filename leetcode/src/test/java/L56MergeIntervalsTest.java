import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L56MergeIntervalsTest {

    @Test
    public void merge1() {
        int[][] intervals = {
                {15, 18},
                {8, 10},
                {2, 6},
                {1, 3}
        };

        int[][] result = {
                {1, 6},
                {8, 10},
                {15, 18}
        };

        int[][] merge = L56MergeIntervals.merge(intervals);
        assertArrayEquals(result, merge);
    }

    @Test
    public void merge2() {
        int[][] intervals = {
                {1, 4},
                {4, 5}
        };

        int[][] result = {
                {1, 5}
        };

        int[][] merge = L56MergeIntervals.merge(intervals);
        assertArrayEquals(result, merge);
    }


    @Test
    public void merge3() {
        int[][] intervals = {
                {1, 4},
                {2, 3}
        };

        int[][] result = {
                {1, 4}
        };

        int[][] merge = L56MergeIntervals.merge(intervals);
        assertArrayEquals(result, merge);
    }
}