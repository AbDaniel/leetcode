package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/26/17.
 */
public class ContainerWithMostWaterTest {
    @Test
    public void maxArea() throws Exception {
        int[] input = {1, 5, 4, 3};
        int expected = 6;

        int actual = new ContainerWithMostWater().maxArea(input);
        assertEquals(expected, actual);
    }

}