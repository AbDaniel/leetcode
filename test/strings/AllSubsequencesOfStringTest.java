package strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/25/17.
 */
public class AllSubsequencesOfStringTest {
    @Test
    public void subsequences() throws Exception {
        String input = "abc";
        Set<String> expected = new HashSet<>();
        expected.add("");
        expected.add("a");
        expected.add("b");
        expected.add("c");

        expected.add("ab");
        expected.add("ac");
        expected.add("bc");

        expected.add("abc");

        AllSubsequencesOfString str = new AllSubsequencesOfString();
        Set<String> actual = str.subsequences("abc");

        assertEquals(expected, actual);

    }

}