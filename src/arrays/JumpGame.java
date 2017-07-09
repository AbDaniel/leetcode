package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by daniel on 7/9/17.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int reach = 0;

        for (int i = 0; i < nums.length && i <= reach; i++) {
            if (reach >= nums.length - 1) return true;
            reach = Math.max(reach, i + nums[i]);
        }

        return false;
    }
}
