package dynamicprogramming.bottomup;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/27/17.
 */
public class CuttingRodBottomUpTest {
    @Test
    public void cutRod() throws Exception {
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};

        int expected = 22;

        int actual = new CuttingRodBottomUp().maximumGain(prices);

        assertEquals(expected, actual);
    }

}