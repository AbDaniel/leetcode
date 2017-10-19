package tree;


import apple.laf.JRSUIUtils;

/**
 * Created by daniel on 10/18/17.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LC285_InorderSuccessor {

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (isLeaf(root)) return null;
        if (isLeaf(p)) return null;

        if (root.val == p.val) {
            if (root.right == null) return null;
            else inorderNext(root.right);
        }

        TreeNode parent = findParent(root, p);
        if (parent.left.val == p.val && p.right == null) return parent;
        if (p.right == null) return null;
        return inorderNext(p.right);
    }

    private TreeNode findParent(TreeNode root, TreeNode p) {
        if (root.left.val == p.val || root.right.val == p.val) return root;

        if (root.val > p.val) return findParent(root.left, p);
        else return findParent(root.right, p);
    }

    private TreeNode inorderNext(TreeNode root) {
        if (root.left == null && root.right == null) return root;

        if (root.left == null) return root;
        return inorderNext(root.left);
    }

    public static void main(String[] args) {

    }

}
