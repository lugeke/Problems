package chp8;

import java.util.*;

public class RobotInaGrid {

    int[][] grid;
    int rows;
    int cols;

    Deque<Character> path;
    public RobotInaGrid(int[][] grid) {
        this.grid = grid;
        rows = grid.length - 1;
        cols = grid[0].length - 1;
        path = new LinkedList<>();
    }

    public Collection<Character> findPath() {
        findPath(0, 0);
        return path;
    }


    private boolean findPath(int row, int col) {

        if (row == this.rows && col == this.cols) return true;
        // →
        if (col < this.cols && grid[row][col+1] == 1) {
            path.add('→');
            if (findPath(row, col+1)) return true;
            path.removeLast();
        }

        // ↓
        if (row < this.rows && grid[row+1][col] == 1) {
            path.add('↓');
            if (findPath(row+1, col)) return true;
            path.removeLast();
        }

        return false;
    }


}
