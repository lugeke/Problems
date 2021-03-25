import org.junit.Test;

import static org.junit.Assert.*;

public class L64MinimumPathSumTest {

    @Test
    public void minPathSum1() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        assertEquals(7, L64MinimumPathSum.minPathSum(grid));
    }

    @Test
    public void minPathSum2() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };

        assertEquals(12, L64MinimumPathSum.minPathSum(grid));
    }
}