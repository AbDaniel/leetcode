package arrays;

/**
 * Created by daniel on 10/15/17.
 */
public class LC162_FindPeakElement {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (isPeak(nums, mid)) return mid;

            if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private boolean isPeak(int[] nums, int i) {
        if (nums.length == 1) return true;
        if (i == 0) {
            return nums[i + 1] < nums[i];
        } else if (i == nums.length - 1) {
            return nums[i - 1] < nums[i];
        }

        return (nums[i - 1] < nums[i]) && (nums[i] > nums[i + 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int peakElement = new LC162_FindPeakElement().findPeakElement(arr);
        System.out.println(peakElement);
    }
}
