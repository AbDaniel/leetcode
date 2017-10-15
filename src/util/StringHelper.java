package util;

import java.util.Arrays;

/**
 * Created by aw186034 on 6/27/17.
 */
public class StringHelper {

    public static void print2DIntArray(int[][] table) {
        String twoDArray = Arrays.deepToString(table).replace("], ", "]\n").replace("]", "").replace("[", "");
        System.out.println(twoDArray);
    }

    public static void print2DBooleanArray(boolean[][] table) {
        String twoDArray = Arrays.deepToString(table).replace("], ", "]\n").replace("]", "").replace("[", "");
        System.out.println(twoDArray);
    }
}
