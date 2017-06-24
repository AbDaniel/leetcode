package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aw186034 on 6/24/17.
 */
public class LongestSubstringWithoutRepeatingChar {


    public int longestSubString(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int i, j;

        int ans = 0;
        for (j = 0, i = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            if (map.containsKey(currentChar)) {
                i = Math.max(map.get(currentChar), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(currentChar, j + 1);
        }
        return ans;
    }

}
