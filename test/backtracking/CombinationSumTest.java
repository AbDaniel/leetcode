package backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by daniel on 7/9/17.
 */
public class CombinationSumTest {
    @Test
    public void combinationSum() throws Exception {
        int[] nums = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        subSet.add(7);

        expected.add(subSet);

        subSet = new ArrayList<>();
        subSet.add(2);
        subSet.add(2);
        subSet.add(3);

        expected.add(subSet);

        List<List<Integer>> actual = new CombinationSum().combinationSum(nums, target);

        assertEquals(expected, actual);
    }

}