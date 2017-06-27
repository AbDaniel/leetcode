package dynamicprogramming.recursion;

/**
 * Created by aw186034 on 6/26/17.
 */
public class NumberOfPaths {

    public int numberOfPaths(boolean[][] board) {
        return findNumberOfPaths(board, 0, 0);
    }

    private int findNumberOfPaths(boolean[][] board, int startRow, int startCol) {
        if (invalidIndices(board, startRow, startCol)) return 0;
        if (isEnd(board, startRow, startCol)) return 1;

        return findNumberOfPaths(board, startRow + 1, startCol) +
                findNumberOfPaths(board, startRow, startCol + 1);
    }

    private boolean isEnd(boolean[][] board, int startRow, int startCol) {
        return startRow == board.length - 1 && startCol == board[0].length - 1;
    }

    private boolean invalidIndices(boolean[][] board, int startRow, int startCol) {
        return startRow < 0 || startCol < 0 || startRow >= board.length || startCol >= board[0].length || !board[startRow][startCol];
    }
}
