import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L240SearchA2DMatrixIITest {

    @Test
    public void searchMatrix1() {

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        assertTrue(L240SearchA2DMatrixII.searchMatrix(matrix, 5));
        assertTrue(L240SearchA2DMatrixII.searchMatrix(matrix, 30));

        assertFalse(L240SearchA2DMatrixII.searchMatrix(matrix, 20));
    }

    @Test
    public void searchMatrix2() {

        int[][] matrix = {
                {1, 4},
                {2, 5}
        };

        assertFalse(L240SearchA2DMatrixII.searchMatrix(matrix, 6));
    }

    @Test
    public void searchMatrix3() {

        int[][] matrix = {
                {2, 5},
                {2, 8},
                {7, 9},
                {7, 11},
                {9, 11}
        };

        assertTrue(L240SearchA2DMatrixII.searchMatrix(matrix, 7));
    }

//[[2,5],[2,8],[7,9],[7,11],[9,11]]

}