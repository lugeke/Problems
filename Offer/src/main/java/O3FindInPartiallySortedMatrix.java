import java.util.Arrays;

public class O3FindInPartiallySortedMatrix {

    public static boolean find(int[][] matrix, int number) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int row = matrix.length, col = matrix[0].length;

        for(int i=0, j = col; i < row && j >= 0; i++) {
            int index = Arrays.binarySearch(matrix[i], 0, j, number);
            if (index >= 0) return true;
            else index = -index -1;

            if(index == 0) return false;
            j = index;
        }
        return false;
    }
}
