package strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 6/25/17.
 */
public class LongestPalindromicSubStringTest {

    @Test
    public void longestPalindrome() throws Exception {
        String input = "babad";
        String expected = "bab";

        LongestPalindromicSubString algo = new LongestPalindromicSubString();
        String actual = algo.longestPalindrome(input);
        assertEquals(expected, actual);

        input = "cbbd";
        expected = "bb";

        actual = algo.longestPalindrome(input);
        assertEquals(expected, actual);
    }

}