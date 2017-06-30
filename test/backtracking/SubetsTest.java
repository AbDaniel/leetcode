package backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/29/17.
 */
public class SubetsTest {
    @Test
    public void subsets() throws Exception {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> one = new ArrayList<>();
        one.add(3);
        expected.add(one);

        one = new ArrayList<>();
        one.add(2);
        expected.add(one);

        one = new ArrayList<>();
        one.add(1);
        expected.add(one);

        one = new ArrayList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        expected.add(one);

        one = new ArrayList<>();
        one.add(1);
        one.add(3);
        expected.add(one);

        one = new ArrayList<>();
        one.add(2);
        one.add(3);
        expected.add(one);

        one = new ArrayList<>();
        one.add(1);
        one.add(2);
        expected.add(one);

        one = new ArrayList<>();
        expected.add(one);

        List<List<Integer>> actual = new Subets().subsets(nums);

        assertEquals(expected, actual);
    }

}