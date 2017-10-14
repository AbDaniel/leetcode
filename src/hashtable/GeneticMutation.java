package hashtable;

import java.util.*;


/**
 * Created by daniel on 10/8/17.
 */
public class GeneticMutation {

    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> strings = new HashSet<>();
        for (String s : bank) {
            strings.add(s);
        }

        Queue<String> queue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();

        int depth = 0;
        queue.add(start);
        depthQueue.add(depth);

        Set<String> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            String currentString = queue.poll();
            visited.add(currentString);

            int currentDepth = depthQueue.poll();
            if (currentString.equals(end)) return currentDepth;

            for (int i = 0; i < currentString.length(); i++) {
                for (String string : strings) {
                    if (editDistance(string, currentString) == 1 && !visited.contains(string)) {
                        queue.add(string);
                        depthQueue.add(currentDepth + 1);
                    }
                }
            }
        }

        return -1;
    }

    private int editDistance(String string, String currentString) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != currentString.charAt(i)) count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = 0;
        GeneticMutation geneticMutation = new GeneticMutation();

        String start = "AACCGGTT";
        String end = "AAACGGTA";

        start = "AACCGGTT";
        end = "AAACGGTA";
        String[] bank2 = {"AACCGATT", "AACCGATA", "AAACGATA", "AAACGGTA"};

        result = geneticMutation.minMutation(start, end, bank2);
        System.out.println(result);
    }

}
