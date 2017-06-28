package arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/27/17.
 */
public class ThreeSumTest {
    @Test
    public void threeSum() throws Exception {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> solution1 = new ArrayList<>();
        solution1.add(-1);
        solution1.add(0);
        solution1.add(1);

        List<Integer> solution2 = new ArrayList<>();
        solution2.add(-1);
        solution2.add(-1);
        solution2.add(2);

        expected.add(solution1);
        expected.add(solution2);

        assertEquals(expected, new ThreeSum().threeSum(arr));
    }

}