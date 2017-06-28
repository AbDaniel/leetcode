package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aw186034 on 6/27/17.
 */
public class LargetZeroSumSubArray {

    public int length(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
                continue;
            }

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum) + 1);
            }

            map.put(sum, i);
        }

        return maxLength;
    }

}
