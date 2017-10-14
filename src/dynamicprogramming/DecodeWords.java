package dynamicprogramming;

/**
 * Created by daniel on 7/17/17.
 */
public class DecodeWords {
    public static int numDecodings(String s) {
        if (s.length() == 0) return 0;

        int[] table = new int[s.length()];

        table[0] = Character.getNumericValue(s.charAt(0)) == 0 ? 0 : 1;

        for (int i = 1; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) != 0) {
                table[i] += (table[i - 1] == 0) ? 1 : table[i - 1];
                Integer no = Integer.valueOf(s.substring(i - 1, i + 1));
                if (no <= 26) table[i] += 1;
            }
        }

        return table[s.length() - 1];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("6065812287883668764831544958683283296479682877898293612168136334983851946827579555449329483852397155"));
    }
}
