package arrays;

import static util.StringHelper.print2DIntArray;

/**
 * Created by daniel on 10/10/17.
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

//        rotate90(arr);
        transpose(arr);
        print2DIntArray(arr);
    }

    private static void rotate90(int[][] arr) {
        int size = arr.length - 1;
        for (int start = 0; start <= size; start++) {
            int last = size - start;
            for (int i = 0; i < (last - start); i++) {
                int temp = arr[start][start + i];

                //Bottom Left to top
                arr[start][start + i] = arr[last - i][start];

                //Bottom right to bottom left
                arr[last - i][start] = arr[last][last - i];

                //Top right to bottom Right
                arr[last][last - i] = arr[start + i][last];

                //Temp tp Top right
                arr[start + i][last] = temp;
            }
        }
    }

    private static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
}
