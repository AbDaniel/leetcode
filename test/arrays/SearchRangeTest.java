package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/28/17.
 */
public class SearchRangeTest {
    @Test
    public void searchRange() throws Exception {
        int[] input = {5, 7, 7, 8, 8, 10};
        int[] expected = {3, 4};

        SearchRange sr = new SearchRange();
        int[] actual = sr.searchRange(input, 8);

        assertEquals(expected, actual);
    }

}