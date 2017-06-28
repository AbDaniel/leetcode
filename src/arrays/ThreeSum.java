package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by daniel on 6/27/17.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            map.put(nums[i], temp);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int requiredTwoSum = 0 - nums[i];

            int j;
            List<Integer> thirdValues = null;
            for (j = i + 1; j < nums.length - 1; j++) {
                int requiredNum = requiredTwoSum - nums[j];
                if (map.containsKey(requiredNum)) {
                    thirdValues = map.get(requiredNum);
                    for (int thirdValue : thirdValues) {
                        if (thirdValue > j) {
                            List<Integer> solution = new ArrayList<>();
                            solution.add(nums[i]);
                            solution.add(nums[j]);
                            solution.add(nums[thirdValue]);

                            result.add(solution);
                        }
                    }
                }
            }

        }
        return result;
    }
}
