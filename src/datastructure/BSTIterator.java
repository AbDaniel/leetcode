package datastructure;

import java.util.Stack;

/**
 * Created by daniel on 10/15/17.
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode root;

    public BSTIterator(TreeNode root) {
        this.root = root;

        TreeNode temp = root;
        while (temp != null) {
            stack.push(temp);
            temp = temp.left;
        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode node = stack.pop();
        updateStack(node);

        return node.val;
    }

    private void updateStack(TreeNode node) {
        if (node.right == null) return;


        TreeNode temp = node.right;
        while (temp != null) {
            stack.push(temp);
            temp = temp.left;
        }
    }

    public static TreeNode generateBST(int[] arr) {
        return generateBST(arr, 0, arr.length - 1);
    }

    public static TreeNode generateBST(int[] arr, int left, int right) {
        if (right < left) return null;

        int mid = left + (right - left) / 2;

        TreeNode node = new TreeNode(arr[mid]);
        node.left = generateBST(arr, left, mid - 1);
        node.right = generateBST(arr, mid + 1, right);

        return node;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        TreeNode treeNode = generateBST(arr);
        TreeNode treeNode = new TreeNode(3);
        treeNode.right = new TreeNode(4);

        treeNode.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);

        BSTIterator iterator = new BSTIterator(treeNode);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
