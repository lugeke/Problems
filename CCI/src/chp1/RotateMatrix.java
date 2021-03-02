package chp1;

import java.util.Arrays;

public class RotateMatrix {

    public static void rotate(int[][] matrix) {
        int n = matrix.length - 1;

        for (int i = 0; i <= n/2; i++)
            for (int j = i; j < n-i; j++) {
                int delta = j - i;
                int t = matrix[i][i+delta];
                matrix[i][i+delta] = matrix[n-i-delta][i];
                matrix[n-i-delta][i] = matrix[n-i][n-i-delta];
                matrix[n-i][n-i-delta] = matrix[i+delta][n-i];
                matrix[i+delta][n-i] = t;
            }
    }

    public static void main(String[] args) {
        int[][] m = {
                {1,2,},
                {3,4}
        };


        rotate(m);

        System.out.println(Arrays.deepToString(m));

        int[][] n = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotate(n);

        System.out.println(Arrays.deepToString(n));
    }
}
