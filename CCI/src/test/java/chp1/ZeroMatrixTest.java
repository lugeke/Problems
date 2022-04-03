package chp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMatrixTest {

    @Test
    public void zero() {

        int[][] matrix = {
                {1,2,3,4},
                {0,5,0,6},
                {7,8,9,10},
                {0,1,2,3}
        };

        int[][] zero = {
                {0,2,0,4},
                {0,0,0,0},
                {0,8,0,10},
                {0,0,0,0}
        };


        ZeroMatrix.zero(matrix);

        assertArrayEquals(zero, matrix);
    }
}