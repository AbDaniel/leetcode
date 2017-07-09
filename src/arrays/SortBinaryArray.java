package arrays;

import java.util.List;

/**
 * Created by daniel on 7/5/17.
 */
public class SortBinaryArray {

    public int[] sort(int[] arr) {

        int zeroIndex = 0;
        int oneIndex = arr.length - 1;

        do {
            while (arr[zeroIndex] == 0) zeroIndex += 1;
            while (arr[oneIndex] == 1) oneIndex -= 1;

            if (zeroIndex < oneIndex) {
                swap(arr, zeroIndex, oneIndex);
            }
        } while (zeroIndex < oneIndex);

        return arr;
    }

    private void swap(int[] arr, int src, int dest) {
        int temp = arr[src];
        arr[src] = arr[dest];
        arr[dest] = temp;
    }

}
