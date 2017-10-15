package strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 10/15/17.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        generateUtil(result, "", 0, 0, 0, n);
        return result;
    }

    public void generateUtil(List<String> result, String str, int open, int closed, int i, int n) {
        if (closed > n || open > n || closed > open) return;

        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        if (open <= n) {
            generateUtil(result, str + "(", open + 1, closed, i + 1, n);
        }

        if (closed <= n) {
            generateUtil(result, str + ")", open, closed + 1, i + 1, n);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new GenerateParentheses().generateParenthesis(3);
        System.out.println(strings);
    }
}
