import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L48RotateImageTest {

    @Test
    public void rotate1() {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] result = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        L48RotateImage.rotate(matrix);

//        System.out.println(Arrays.deepToString(matrix));
        assertArrayEquals(result, matrix);
    }


    @Test
    public void rotate2() {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        int[][] result = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };

        L48RotateImage.rotate(matrix);
        assertArrayEquals(result, matrix);
    }


    @Test
    public void rotate3() {
        int[][] matrix = {
                {1},
        };
        int[][] result = {
                {1}
        };

        L48RotateImage.rotate(matrix);
        assertArrayEquals(result, matrix);
    }

    @Test
    public void rotate4() {

        int[][] matrix = {
                {1, 2},
                {3, 4},
        };
        int[][] result = {
                {3, 1},
                {4, 2},
        };

        L48RotateImage.rotate(matrix);
        assertArrayEquals(result, matrix);
    }

}