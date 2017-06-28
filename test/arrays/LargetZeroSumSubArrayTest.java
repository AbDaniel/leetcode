package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/27/17.
 */
public class LargetZeroSumSubArrayTest {
    @Test
    public void length() throws Exception {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int expected = 5;

        int actual = new LargetZeroSumSubArray().length(arr);
        assertEquals(expected, actual);
    }

}