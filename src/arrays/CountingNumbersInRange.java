package arrays;

import java.util.Arrays;

/**
 * Created by daniel on 7/12/17.
 */
public class CountingNumbersInRange {
    public int solutionOne(int[] arr, int start, int end) {
        int count = 0;
        for (int elem : arr) {
            if (inRange(elem, start, end)) {
                count += 1;
            }
        }
        return count;
    }

    public boolean inRange(int elem, int start, int end) {
        return elem >= start && elem <= end;
    }

    public int solutionTwo(int[] arr, int start, int end) {
        Arrays.sort(arr);

        int low = findHighestElementLowerThan(arr, start);
        int high = findLowestElementHightThan(arr, end);

        return high - low + 1;
    }

    public int findHighestElementLowerThan(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int current = arr[mid];

            if (current >= val) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public int findLowestElementHightThan(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int current = arr[mid];

            if (current > val) high = mid - 1;
            else low = mid + 1;
        }

        return high;
    }
}
