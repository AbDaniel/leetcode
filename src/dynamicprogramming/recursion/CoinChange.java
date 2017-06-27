package dynamicprogramming.recursion;

/**
 * Created by daniel on 6/26/17.
 */
public class CoinChange {

    public int count(int[] coins, int sum) {
        return loop(coins, 0, sum);
    }

    public int loop(int[] coins, int start, int sum) {
        if (sum == 0) {
            return 1;
        }
        if (sum < 0) {
            return 0;
        }
        if (start >= coins.length  && sum >= 1) {
            return 0;
        }

        return loop(coins, start, sum - coins[start]) + loop(coins, start + 1, sum);
    }
}
