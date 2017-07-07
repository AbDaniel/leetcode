package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 7/6/17.
 */
public class ProductOfNumbersExceptSelfTest {
    @Test
    public void productExceptSelf() throws Exception {
        int[] input = {1, 2, 3, 4};

        int[] expected = {24, 12, 8, 6};

        int[] actual = new ProductOfNumbersExceptSelf().productExceptSelf(input);

        assertArrayEquals(expected, actual);
    }

}