public class L64MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        // sum[i][j] = grid[i][j] + min(sum[i-1][j], sum[i][j-1])
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] sum = new int[rows][cols];

        // 初始化行
        sum[0][0] = grid[0][0];
        for (int col = 1; col < cols; col++) {
            sum[0][col] = sum[0][col-1] + grid[0][col];
        }

        // 初始化列
        for (int i = 1; i < rows; i++) {
            sum[i][0] = sum[i-1][0] + grid[i][0];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                sum[i][j] = grid[i][j] + Math.min(sum[i-1][j], sum[i][j-1]);
            }
        }

        return sum[rows-1][cols-1];
    }


}
