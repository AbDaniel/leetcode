package arrays;

import java.util.*;

/**
 * Created by daniel on 6/28/17.
 * Leet code problem 17.
 */

public class LetterCombinationPhoneNumber {
    public Map<Integer, List<Character>> keyBoardMapping() {
        Map<Integer, List<Character>> map = new HashMap<>();

        char start = 'a';
        for (int i = 2; i <= 9; i++) {
            List<Character> charSet = new ArrayList<>();
            charSet.add(start++);
            charSet.add(start++);
            charSet.add(start++);
            if(i == 7 || i == 9) {
                charSet.add(start++);
            }

            map.put(i, charSet);
        }

        return map;
    }

    public List<String> letterCombinations(String digits) {
        Map<Integer, List<Character>> map = keyBoardMapping();

        char[] chars = digits.toCharArray();

        Integer[] integers = digits.chars().mapToObj(Character::getNumericValue).toArray(Integer[]::new);

        List<String> solution = new ArrayList<>();
        for (int digit : integers) {
            solution = crossProduct(solution, map.get(digit));
        }

        return solution;
    }

    private List<String> crossProduct(List<String> solution, List<Character> characters) {
        List<String> newSolution = new ArrayList<>();

        if (solution.isEmpty()) solution.add("");
        for (String br : solution) {
            for (Character ch : characters) {
                newSolution.add(br + ch);
            }
        }
        return newSolution;
    }
}
