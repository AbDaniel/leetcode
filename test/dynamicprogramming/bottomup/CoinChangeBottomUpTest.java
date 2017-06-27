package dynamicprogramming.bottomup;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/27/17.
 */
public class CoinChangeBottomUpTest {
    @Test
    public void count() throws Exception {
        int[] coins = {1, 2, 3};
        int sum = 4;
        int expected = 4;

        CoinChangeBottomUp algo = new CoinChangeBottomUp();
        int actual = algo.count(coins, sum);

        assertEquals(expected, actual);

        int[] coins2 = {2, 5, 3, 6};
        sum = 10;
        expected = 5;

        actual = algo.count(coins2, sum);

        assertEquals(expected, actual);

    }
}