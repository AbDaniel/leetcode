package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 7/5/17.
 */
public class SortBinaryArrayTest {
    @Test
    public void sort() throws Exception {
        int[] input = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};

        int[] expected = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};

        int[] actual = new SortBinaryArray().sort(input);

        assertArrayEquals(expected, actual);
    }

}