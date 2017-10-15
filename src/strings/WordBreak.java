package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by daniel on 10/14/17.
 */
public class WordBreak {

    class TrieNode {
        char c;
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isLeaf;

        public TrieNode(char c) {
            this.c = c;
        }

        public TrieNode() {
        }
    }

    class Trie {
        TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        public void insert(String word) {
            Map<Character, TrieNode> children = root.children;

            char[] wordArray = word.toCharArray();
            for (int i = 0; i < wordArray.length; i++) {
                char c = wordArray[i];
                if (children.containsKey(c)) {
                    TrieNode trieNode = children.get(c);
                    children = trieNode.children;

                    if (wordArray.length - 1 == i) {
                        trieNode.isLeaf = true;
                    }
                } else {
                    TrieNode newNode = new TrieNode(c);
                    children.put(c, newNode);
                    children = children.get(c).children;

                    if (wordArray.length - 1 == i) {
                        newNode.isLeaf = true;
                    }
                }
            }
        }

        public boolean search(String word) {
            Map<Character, TrieNode> children = root.children;

            char[] wordArray = word.toCharArray();
            for (int i = 0; i < wordArray.length; i++) {
                char c = wordArray[i];

                if (children.containsKey(c)) {
                    TrieNode t = children.get(c);
                    children = t.children;

                    if (word.length() - 1 == i) {
                        return t.isLeaf;
                    }
                } else {
                    return false;
                }
            }

            return false;
        }

        public TrieNode searchNode(String str) {
            Map<Character, TrieNode> children = root.children;
            TrieNode t = null;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (children.containsKey(c)) {
                    t = children.get(c);
                    children = t.children;
                } else {
                    return null;
                }
            }

            return t;
        }

        public boolean startsWith(String prefix) {
            return searchNode(prefix) != null;
        }
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = new Trie();

        for (String str : wordDict) {
            trie.insert(str);
        }

        return acceptable(s.toCharArray(), 0, trie.root, trie.root);
    }

    public boolean acceptable(char[] word, int i, TrieNode current, TrieNode root) {
        if (current.children.isEmpty() || word.length == i) return false;

        char c = word[i];
        Map<Character, TrieNode> children = current.children;

        if (!children.containsKey(c)) return false;

        TrieNode node = children.get(c);
        if (node.isLeaf && i == word.length - 1) return true;
        else if (node.isLeaf) {
            if (acceptable(word, i + 1, root, root)) {
                return true;
            }
        }

        return acceptable(word, i + 1, node, root);
    }

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        boolean breakable = new WordBreak().wordBreak("leetcode", wordDict);
        System.out.println(breakable);
    }

}
