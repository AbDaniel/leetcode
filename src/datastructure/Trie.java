package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 10/14/17.
 */

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

public class Trie {
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