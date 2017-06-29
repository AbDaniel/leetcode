package algo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/28/17.
 */
public class BinarySearchTest {
    @Test
    public void search() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        BinarySearch bs = new BinarySearch();
        int expected = 0;
        int actual = bs.search(arr, 1);
        assertEquals(expected, actual);

        expected = 5;
        actual = bs.search(arr, 6);
        assertEquals(expected, actual);

        expected = 6;
        actual = bs.search(arr, 7);
        assertEquals(expected, actual);
    }

}