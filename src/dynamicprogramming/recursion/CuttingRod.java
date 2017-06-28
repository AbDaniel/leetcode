package dynamicprogramming.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by daniel on 6/27/17.
 */
public class CuttingRod {
    public int maximumGain(int[] price) {
        return cutRod(price, price.length);
    }

    private int cutRod(int[] price, int length) {
        if (length == 0) return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int price1 = price[i];
            int end = length - i - 1;

            int price2 = cutRod(price, end);

            max = Math.max(max, price1 + price2);
        }

        return max;
    }
}
