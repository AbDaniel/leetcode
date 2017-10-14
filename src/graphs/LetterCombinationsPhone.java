package graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 9/26/17.
 */
public class LetterCombinationsPhone {
    public static List<String> letterCombinations(String digits) {
        String[] lookup = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> oldList = new ArrayList<>();
        oldList.add("");
        for (char c : digits.toCharArray()) {
            int no = Character.getNumericValue(c);
            List<String> newList = new ArrayList<>();

            for (char letter : lookup[no].toCharArray()) {
                for (String s : oldList) {
                    newList.add(s + letter);
                }
            }

            oldList = newList;
        }

        return oldList;
    }

    public static void main(String[] args) {
        List<String> strings = letterCombinations("23");
        System.out.println(strings);
    }
}
