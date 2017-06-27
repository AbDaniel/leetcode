package dynamicprogramming.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/26/17.
 */
public class CoinChangeTest {
    @Test
    public void count() throws Exception {
        int[] coins = {1, 2, 3};
        int sum = 4;
        int expected = 4;

        CoinChange algo = new CoinChange();
        int actual = algo.count(coins, sum);

        assertEquals(expected, actual);

        int[] coins2 = {2, 5, 3, 6};
        sum = 10;
        expected = 5;

        actual = algo.count(coins2, sum);

        assertEquals(expected, actual);

    }

}