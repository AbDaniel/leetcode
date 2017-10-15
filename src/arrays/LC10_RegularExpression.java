package arrays;

import static util.StringHelper.print2DBooleanArray;

/**
 * Created by daniel on 10/14/17.
 */
public class LC10_RegularExpression {
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();

        boolean firstMatch = !text.isEmpty() && (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.');

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) || (firstMatch && isMatch(text.substring(1), pattern)));
        } else {
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public boolean isMatchDP(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][dp[0].length - 1] = false;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[dp.length - 1][i] = false;
        }

        dp[text.length()][pattern.length()] = true;

        for (int i = text.length() - 1; i >= 0; i--) {
            for (int j = pattern.length() - 1; j >= 0; j--) {
                boolean first_match = (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.');
                if (j != pattern.length() - 1 && pattern.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || first_match && dp[i + 1][j];
                } else {
                    dp[i][j] = first_match && dp[i + 1][j + 1];
                }
            }
        }

        print2DBooleanArray(dp);
        return dp[0][0];
    }

    public static void main(String[] args) {
        String text = "aaaab";
        String pattern = "a*b";

        System.out.println(new LC10_RegularExpression().isMatchDP(text, pattern));


    }
}