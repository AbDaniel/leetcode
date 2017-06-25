package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/24/17.
 */
public class MedianOfTwoArraysTest {
    @Test
    public void median() throws Exception {
        int[] a1 = {1, 2};
        int[] a2 = {3, 4};

        assertEquals(2.5, new MedianOfTwoArrays().median(a1, a2), 0.0005);
    }

}