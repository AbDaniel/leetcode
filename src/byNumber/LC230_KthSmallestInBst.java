package byNumber;

/**
 * Created by daniel on 10/12/17.
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    int size;

    TreeNode(int x) {
        val = x;
    }

}


public class LC230_KthSmallestInBst {
    public static int kthSmallest(TreeNode root, int k) {
        int count = count(root.left);

        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            return kthSmallest(root.left, k - count - 1);
        }
        return root.val;
    }

    public static int count(TreeNode root) {
        if (root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }

    public static TreeNode generateBalanceBinaryTree(int[] nums) {
        return generateTreeUtil(nums, 0, nums.length - 1);
    }

    private static TreeNode generateTreeUtil(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = generateTreeUtil(nums, left, mid - 1);
        root.right = generateTreeUtil(nums, mid + 1, right);

        return root;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        TreeNode node = generateBalanceBinaryTree(arr);

        System.out.println(count(node));
    }
}
