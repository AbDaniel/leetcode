package dynamicprogramming.bottomup;

/**
 * Created by daniel on 6/27/17.
 */
public class CuttingRodBottomUp {
    public int maximumGain(int[] price) {
        return cutRod(price, price.length);
    }

    private int cutRod(int[] price, int length) {
        if (length == 0) return 0;

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                int cutPrice = price[j] + price[i - j - 1];
                price[i] = Math.max(price[i], cutPrice);
            }
        }

        return price[length - 1];
    }
}