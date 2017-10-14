package arrays;

import java.util.*;

/**
 * Created by daniel on 10/14/17.
 */
public class LC308_LongestAbsFilePath {
    static class Tree {
        String val;
        int level;
        List<Tree> neighbours;

        public Tree(String val) {
            this.val = val;
            neighbours = new ArrayList<>();
        }
    }

//    public static int lengthLongestPath(String input) {
//        int max = 0;
//
//        Stack<String> stack = new Stack<>();
//        String[] names = input.split("\n");
//        for (String name : names) {
//            int level = name.length() - name.trim().length();
//            while (level < stack.size()) stack.pop();
//
//            int length = 0;
//            for (String s : stack) {
//                length += s.trim().length();
//            }
//
//            length += stack.size() + name.trim().length();
//            if (name.contains(".")) {
//                max = Math.max(max, length);
//            }
//            else {
//                stack.push(name);
//            }
//        }
//        return max;
//    }

    public static int lengthLongestPath(String input) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0); // "dummy" length
        int maxLen = 0;
        for (String s : input.split("\n")) {
            int lev = s.lastIndexOf("\t") + 1; // number of "\t"
            while (lev + 1 < stack.size()) stack.pop(); // find parent
            int len = stack.peek() + s.length() - lev + 1; // remove "/t", add"/"
            stack.push(len);
            // check if it is file
            if (s.contains(".")) maxLen = Math.max(maxLen, len - 1);
        }
        return maxLen;
    }

    public static Tree buildTree(String str) {
        String[] names = str.split("\n");

        Stack<Tree> stack = new Stack<>();
        Tree root = null;

        for (String name : names) {
            String nodeName = name.trim();
            int level = name.length() - nodeName.length();

            if (stack.isEmpty()) {
                root = new Tree(nodeName);
                stack.add(root);
            } else if (level - stack.peek().level == 1) {
                Tree node = new Tree(nodeName);
                node.level = level;
                stack.peek().neighbours.add(node);
            } else if (level - stack.peek().level == 0) {
                Tree node = new Tree(nodeName);
                node.level = level;
                stack.pop();
                stack.peek().neighbours.add(node);
            } else if (level - stack.peek().level == 2) {
                Tree node = new Tree(nodeName);
                node.level = level;
                List<Tree> stackTop = stack.peek().neighbours;
                stack.push(stackTop.get(stackTop.size() - 1));

                stack.peek().neighbours.add(node);
            }
        }

        return root;
    }


    public static void main(String[] args) {
        String str = "dir\n" +
                "\tsubdir1\n" +
                "\t\tfile1.ext\n" +
                "\t\tsubsubdir1\n" +
                "\tsubdir2\n" +
                "\t\tsubsubdir2\n" +
                "\t\t\tfile2.ext";

        String str2 = "\"dir\\n        file.txt\"";

        System.out.println(lengthLongestPath(str2));
    }
}
