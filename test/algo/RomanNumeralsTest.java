package algo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 9/13/17.
 */
public class RomanNumeralsTest {
    @Test
    public void romanToInt() throws Exception {
        String input = "MCMLIV";
        int expected = 1954;
        int actual = 0;
        actual = new RomanNumerals().romanToInt(input);
        assertEquals(expected, actual);
        assertEquals(expected, actual);

        input = "MCMXC";
        expected = 1990;
        actual = new RomanNumerals().romanToInt(input);
        assertEquals(expected, actual);

        input = "MMXIV";
        expected = 2014;
        actual = new RomanNumerals().romanToInt(input);
        assertEquals(expected, actual);
    }

}