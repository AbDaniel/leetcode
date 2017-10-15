package strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 10/15/17.
 */
public class Permuations {

    public static void main(String[] args) {
        String str = "abc";

        List<String> permutations = permutations(str);

        System.out.println(permutations);
    }

    private static List<String> permutations(String str) {
        ArrayList<String> permutations = new ArrayList<>();
        permutationsHelper(permutations, "", str);

        return permutations;
    }

    private static void permutationsHelper(ArrayList<String> permutations, String rest, String str) {
        if (str == null || str.isEmpty()) {
            permutations.add(rest);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newRest = rest.concat(String.valueOf(str.charAt(i)));
            String newStr = str.substring(0, i) + str.substring(i + 1, str.length());
            permutationsHelper(permutations, newRest, newStr);
        }
    }
}
