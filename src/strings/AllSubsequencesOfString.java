package strings;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by daniel on 6/25/17.
 */
public class AllSubsequencesOfString {

    public Set<String> subsequences(String s) {
        int subsequenceLength = 1 << s.length();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < subsequenceLength; i++) {
            StringBuilder br = new StringBuilder("");

            for (int j = 0; j < s.length(); j++) {
                if (BigInteger.valueOf(i).testBit(j)) {
                    br.append(s.charAt(j));
                }
            }
            set.add(br.toString());
        }

        return set;
    }
}
