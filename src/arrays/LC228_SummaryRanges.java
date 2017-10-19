package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 10/17/17.
 */
public class LC228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();

        int start = nums[0];
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            if (prev + 1 == current) {
                if (i == nums.length - 1) {
                    result.add(start + "->" + current);
                }

            } else {
                if (start == prev) {
                    result.add(start + "");
                } else {
                    result.add(start + "->" + prev);
                }

                if (i == nums.length - 1) {
                    result.add(current + "");
                }
                start = current;
            }
            prev = current;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> strings = new LC228_SummaryRanges().summaryRanges(nums);
        System.out.println(strings);
    }
}
