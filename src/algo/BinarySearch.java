package algo;

/**
 * Created by daniel on 6/28/17.
 */
public class BinarySearch {
    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] > target) high = mid - 1;
            if (arr[mid] < target) low = mid + 1;
        }
        return -1;
    }
}
