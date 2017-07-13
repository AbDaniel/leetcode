package arrays;

/**
 * Created by daniel on 7/12/17.
 */
public class MaxSubArrayNonAdjacent {
    public int maxSum(int[] arr) {
        int excl = 0;
        int incl = arr[0];

        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(incl, excl);

            incl = excl + arr[i];
            excl = max;
        }

        return Math.max(incl, excl);
    }
}
