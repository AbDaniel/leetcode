package dynamicprogramming.bottomup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aw186034 on 6/26/17.
 */
public class NumberOfPathsBottomUp {

    public class Tuple {
        int first;
        int second;

        public Tuple(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int numberOfPaths(boolean[][] board) {
        return findNumberOfPaths(board, 0, 0);
    }

    private int findNumberOfPaths(boolean[][] board, int startRow, int startCol) {
        int m = board.length;
        int n = board[0].length;
        int[][] counts = new int[m][n];
        for (int[] row : counts) {
            Arrays.fill(row, 0);
        }

        counts[0][0] = 1;

        for (int row = startRow; row < m; row++) {
            for (int col = startCol; col < n; col++) {
                if (board[row][col]) {
                    for (Tuple coord : possibleParents(board, row, col)) {
                        counts[row][col] += counts[coord.first][coord.second];
                    }
                }
            }
        }


        System.out.println(Arrays.deepToString(counts).replace("], ", "]\n"));
        return counts[m - 1][n - 1];
    }

    public List<Tuple> possibleParents(boolean[][] board, int row, int col) {
        List<Tuple> neigh = new ArrayList<>();

        if (!invalidIndices(board, row - 1, col)) neigh.add(new Tuple(row - 1, col));
        if (!invalidIndices(board, row, col - 1)) neigh.add(new Tuple(row, col - 1));

        return neigh;
    }

    private boolean isEnd(boolean[][] board, int startRow, int startCol) {
        return startRow == board.length - 1 && startCol == board[0].length - 1;
    }

    private boolean invalidIndices(boolean[][] board, int startRow, int startCol) {
        return startRow < 0 || startCol < 0 || startRow >= board.length || startCol >= board[0].length || !board[startRow][startCol];
    }

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
}
