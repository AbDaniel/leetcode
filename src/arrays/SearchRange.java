package arrays;

/**
 * Created by daniel on 6/28/17.
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {

        int[] range = new int[2];
        range[0] = target == nums[0] ? 0 : -1;
        range[1] = target == nums[nums.length - 1] ? 0 : -1;

        int low = 0, high = nums.length - 1;
        if (range[0] == -1) {
            while (low < high) {
                int mid = (low + high) / 2;

                int prevElem = nums[mid - 1];
                int curElem = nums[mid];

                if (curElem == target && prevElem != target) {
                    range[0] = mid;
                    break;
                }
                if (curElem < target) low = mid + 1;
                else high = mid;
            }
        }

        low = range[0];
        high = nums.length - 1;
        if (range[1] == -1) {
            while (low < high) {
                int mid = (low + high) / 2;

                int nextElem = nums[mid + 1];
                int curElem = nums[mid];

                if (curElem == target && nextElem != target) {
                    range[1] = mid;
                    break;
                }
                if (curElem <= target) high = mid;
                else low = mid - 1;
            }
        }


        high = nums.length - 1;

        return range;
    }

}
