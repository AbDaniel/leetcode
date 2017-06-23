package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 5/30/17.
 */
public class TwoSum {

    static Map<Integer, Integer> generateValueIndexMap(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 21};

        int sum = 9;

        int start = 0;
        int end = 0;

        Map<Integer, Integer> valueIndexMap = generateValueIndexMap(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            start = i;
            int expectedSum = sum - i;
            if (valueIndexMap.containsKey(expectedSum)) {
                end = valueIndexMap.get(expectedSum);
            }
        }

        System.out.println(start);
        System.out.println(end);
    }
}
