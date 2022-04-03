import java.util.ArrayList;
import java.util.List;

public class L54SpiralMatrix {

    enum Direction {
        right, down, left, up;
        Direction next(){
            switch (this) {
                case right: return down;
                case down: return left;
                case left: return up;
                case up: return right;
            }
            throw new AssertionError();
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;

        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;
        Direction direction = Direction.right;

        while (startRow <= endRow && startCol <= endCol) {
            switch (direction) {
                case right:
                    for (int col = startCol; col <= endCol; col++) {
                        list.add(matrix[startRow][col]);
                    }
                    startRow++;
                    break;
                case down:
                    for (int row = startRow; row <= endRow; row++) {
                        list.add(matrix[row][endCol]);
                    }
                    endCol--;
                    break;
                case left:
                    for (int col = endCol; col >= startCol; col--) {
                        list.add(matrix[endRow][col]);
                    }
                    endRow--;
                    break;
                case up:
                    for (int row = endRow; row >= startRow; row--) {
                        list.add(matrix[row][startCol]);
                    }
                    startCol++;
                    break;
            }
            direction = direction.next();
        }
        return list;
    }

}
