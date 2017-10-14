package arrays;

/**
 * Created by daniel on 10/12/17.
 */
public class FixedPoint {
    public static int findFixedPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (mid == arr[mid]) return mid;
            if (arr[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-10, 1};
        System.out.println(findFixedPoint(arr));
    }
}
