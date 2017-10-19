package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by daniel on 10/16/17.
 */
public class LC128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int best = 1;

        int i;
        for (i = 0; i < nums.length; i++) {
            int x = nums[i];

            if (set.contains(x + 1) && !set.contains(x - 1)) {
                int currentSize = 2;
                int y = x + 2;
                while (set.contains(y)) {
                    currentSize += 1;
                    y += 1;
                }

                best = Math.max(best, currentSize);
            }
        }

        return best;
    }


    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int[] nums = {4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3};
        int sol = new LC128_LongestConsecutiveSequence().longestConsecutive(nums);
        System.out.println(sol);


        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
