package dynamicprogramming.bottomup;

import java.util.Arrays;

import static util.StringHelper.print2DIntArray;

/**
 * Created by daniel on 6/26/17.
 */
public class CoinChangeBottomUp {

    int count(int[] coins, int expectedSum) {
        int[][] table = new int[expectedSum + 1][coins.length + 1];

        Arrays.fill(table[0], 1);

        for (int row = 1; row < table.length; row++) {
            table[row][0] = 0;
        }

        for (int sum = 1; sum < table.length; sum++) {
            for (int coinIndex = 1; coinIndex < table[0].length; coinIndex++) {

                int coinValue = coins[coinIndex - 1];
                int newSum = sum - coinValue;

                int withCoin = (newSum >= 0) ? table[newSum][coinIndex] : 0;
                int withoutCoin = table[sum][coinIndex - 1];

                table[sum][coinIndex] = withCoin + withoutCoin;
            }
        }

        print2DIntArray(table);
        System.out.println();
        
        return table[table.length - 1][table[0].length - 1];
    }

}
