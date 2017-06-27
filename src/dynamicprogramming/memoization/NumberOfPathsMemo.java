package dynamicprogramming.memoization;

import java.util.Arrays;

/**
 * Created by aw186034 on 6/26/17.
 */
public class NumberOfPathsMemo {

    public int numberOfPaths(boolean[][] board) {
        int[][] counts = new int[board.length][board[0].length];
        for (int[] row : counts) {
            Arrays.fill(row, 0);
        }
        return findNumberOfPaths(board, 0, 0, counts);
    }

    private int findNumberOfPaths(boolean[][] board, int startRow, int startCol, int[][] counts) {
        if (invalidIndices(board, startRow, startCol)) return 0;
        if (isEnd(board, startRow, startCol)) return 1;

        int down = counts[startRow + 1][startCol] == 0 ? findNumberOfPaths(board, startRow + 1, startCol, counts) : counts[startRow + 1][startCol];
        int right = counts[startRow][startCol + 1] == 0 ? findNumberOfPaths(board, startRow, startCol + 1, counts) : counts[startRow][startCol + 1];
        int paths = down + right;

        counts[startRow][startCol] = paths;
        return paths;
    }

    private boolean isEnd(boolean[][] board, int startRow, int startCol) {
        return startRow == board.length - 1 && startCol == board[0].length - 1;
    }

    private boolean invalidIndices(boolean[][] board, int startRow, int startCol) {
        return startRow < 0 || startCol < 0 || startRow >= board.length || startCol >= board[0].length || !board[startRow][startCol];
    }
}
