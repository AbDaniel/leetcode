package strings;

/**
 * Created by daniel on 6/25/17.
 */
public class LongestPalindromicSubString {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        String longest = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String palindrome1 = expand(s, i, i);
            String palindrome2 = "";
            if (s.charAt(i) == s.charAt(i + 1)) palindrome2 = expand(s, i, i + 1);

            String currentPalindrome = palindrome1.length() > palindrome2.length() ? palindrome1 : palindrome2;
            longest = currentPalindrome.length() > longest.length() ? currentPalindrome : longest;
        }

        return longest;
    }

    private String expand(String s, int low, int high) {
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            low -= 1;
            high += 1;
        }

        return s.substring(low + 1, high);
    }
}
