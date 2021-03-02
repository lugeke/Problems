package chp1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RotateMatrixTest {

    @Test
    public void rotate() {

        for (int i = 1; i < 100; i++) {
            int[][] matrix = generate(i);

            RotateMatrix.rotate(matrix);
            assertTrue(isRotation(generate(i), matrix));
        }

    }

    int[][] generate(int n) {
        int[][] result = new int[n][n];

        int cnt = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                result[i][j] = cnt++;
            }
        return result;
    }

    boolean isRotation(int[][] a, int[][] b) {
        List<Integer> la = new ArrayList<>();
        List<Integer> lb = new ArrayList<>();

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++) {
                la.add(a[i][j]);
            }

        for (int i = a.length-1; i >=0 ; i--)
            for (int j = 0; j < a.length; j++) {
                lb.add(b[j][i]);
            }

//        System.out.println(la);
//        System.out.println(lb);
        return la.equals(lb);
    }
}