package strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/24/17.
 */
public class LongestSubstringWithoutRepeatingCharTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        LongestSubstringWithoutRepeatingChar alg = new LongestSubstringWithoutRepeatingChar();
        String expected = "abcabcbb";

        assertEquals(3, alg.longestSubString(expected));

        expected = "bbbbbbb";

        assertEquals(1, alg.longestSubString(expected));

        expected = "pwwkew";

        assertEquals(3, alg.longestSubString(expected));
    }

}