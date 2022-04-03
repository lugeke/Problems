import java.util.Arrays;

public class L240SearchA2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int left = 0, top = 0;
        int right = matrix[0].length - 1, bottom = matrix.length - 1;
        boolean findRow = true;
        while (left <= right && top <= bottom) {
            if (findRow) { // 第top行找
                int i = Arrays.binarySearch(matrix[top], left, right + 1, target);
                if (i >= 0) return true;
                top++;
                // -(i+1)是要插入的位置
                i = -(i + 1) - 1; //要在i列找
                if (i > right) return false;
                right = i;

            } else { // 第 right列 找
                int[] col = new int[bottom - top + 1];
                for (int j = top; j < bottom + 1; j++) {
                    col[j - top] = matrix[j][right];
                }
                int j = Arrays.binarySearch(col, target);
                if (j >= 0) return true;
                right--;
                if (top - (j + 1) > bottom) return false;
//                bottom = top - (j + 1);
            }
            findRow = !findRow;
        }


        return false;
    }


    // 从右上角开始比较，不相等则少一行或列
    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix.length < 1)
            return false;

        int row = 0;
        int col = matrix[row].length - 1;

        while (row < matrix.length && col >= 0) {
            int current = matrix[row][col];

            if (target < current)
                col--;
            else if (target > current)
                row++;
            else
                return true;
        }

        return false;
    }


}
