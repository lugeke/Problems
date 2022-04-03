public class L200NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int n = 0;
        int rows = grid.length, cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    n++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return n;
    }

    private static void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        // right
        if (j < grid[0].length - 1) check(grid, i, j + 1, visited);
        // down
        if (i < grid.length - 1) check(grid, i + 1, j, visited);
        // left
        if (j > 0) check(grid, i, j - 1, visited);
        // up
        if (i > 0) check(grid, i - 1, j, visited);
    }

    private static void check(char[][] grid, int i, int j, boolean[][] visited) {
        if (grid[i][j] == '1' && !visited[i][j]) dfs(grid, i, j, visited);
    }
}
