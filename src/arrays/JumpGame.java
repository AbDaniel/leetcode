package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by daniel on 7/9/17.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        Set<Integer> indexSet = new HashSet<>();

        for (int i = nums.length - 2; i >= 0; i--) {
            int curr = nums[i];
            int maxJump = i + curr;

            if (maxJump >= nums.length - 1) {
                indexSet.add(i);
                continue;
            }

            for (int idx = i + 1; idx <= maxJump; idx++) {
                if (indexSet.contains(idx)) indexSet.add(i);
            }
        }

        return indexSet.contains(0);
    }
}
