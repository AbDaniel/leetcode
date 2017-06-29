package arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/28/17.
 */
public class LetterCombinationPhoneNumberTest {
    @Test
    public void letterCombinations() throws Exception {
        String[] arr = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};

        List<String> expected = new ArrayList<>();
        for (String str : arr) {
            expected.add(str);
        }

        List<String> actual = new LetterCombinationPhoneNumber().letterCombinations("23");
        assertEquals(expected, actual);
    }

}