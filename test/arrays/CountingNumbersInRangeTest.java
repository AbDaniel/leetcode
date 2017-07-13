package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 7/12/17.
 */
public class CountingNumbersInRangeTest {
    @Test
    public void solutionOne() throws Exception {
        int[] arr = {1, 3, 3, 9, 10, 4};

        int start = 1;
        int end = 4;

        int expected = 4;

        int actual = new CountingNumbersInRange().solutionOne(arr, start, end);
        assertEquals(expected, actual);
    }

    @Test
    public void solutionTwo() throws Exception {
        int[] arr = {1, 3, 3, 9, 10, 4};

        int start = 1;
        int end = 4;

        int expected = 4;

        int actual = new CountingNumbersInRange().solutionTwo(arr, start, end);
        assertEquals(expected, actual);
    }

}