package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 7/12/17.
 */
public class MaxSubArrayNonAdjacentTest {
    @Test
    public void maxSum() throws Exception {
        int arr[] = {5, 5, 10, 100, 10, 5};

        int expected = 110;

        int actual = new MaxSubArrayNonAdjacent().maxSum(arr);

        assertEquals(expected, actual);
    }

}