package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 7/9/17.
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> acc = new ArrayList<>();
        backtrack(acc, new ArrayList<>(), 0, candidates, target, 0);
        return acc;
    }

    public void backtrack(List<List<Integer>> acc, List<Integer> curr, int sum, int[] nums, int target, int start) {
        if (sum > target) return;
        if (sum == target) {
            acc.add(new ArrayList<>(curr));
            return;
        }


        for (int i = start; i < nums.length; i++) {
            int current = nums[i];
            curr.add(current);
            backtrack(acc, curr, sum + current, nums, target, i);
            curr.remove(curr.size() - 1);
        }
    }
}
