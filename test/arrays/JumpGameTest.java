package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 7/9/17.
 */
public class JumpGameTest {
    @Test
    public void canJump() throws Exception {
        int[] nums = {2, 3, 1, 1, 4};

        boolean expected = true;

        boolean actual = new JumpGame().canJump(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void canJumpFalse() throws Exception {
        int[] nums = {3, 2, 1, 0, 4};

        boolean expected = false;

        boolean actual = new JumpGame().canJump(nums);
        assertEquals(expected, actual);
    }

}