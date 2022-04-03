import org.junit.Test;

import static org.junit.Assert.*;

public class L200NumberOfIslandsTest {

    @Test
    public void numIslands() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        assertEquals(1, L200NumberOfIslands.numIslands(grid));
    }


    @Test
    public void numIslands1() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        assertEquals(3, L200NumberOfIslands.numIslands(grid));
    }


}