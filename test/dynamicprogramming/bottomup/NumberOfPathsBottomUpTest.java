package dynamicprogramming.bottomup;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/26/17.
 */
public class NumberOfPathsBottomUpTest {

    @Test
    public void numberOfPaths() throws Exception {
        boolean[][] board = new boolean[4][4];
        for (boolean[] row : board)
            Arrays.fill(row, true);

        board[2][1] = false;

        NumberOfPathsBottomUp algo = new NumberOfPathsBottomUp();
        int actual = algo.numberOfPaths(board);
        int expected = 11;

        assertEquals(expected, actual);
    }

}