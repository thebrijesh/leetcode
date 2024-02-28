/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int value = 0;
    boolean v = true;

    public int height(TreeNode root) {
        if (root == null)
            return 0;
    

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void nthLevel(TreeNode root, int n) {
        if (root == null)
            return;
        if (n == 1 && v) {

            value = root.val;
            v = false;
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);

    }

    public int findBottomLeftValue(TreeNode root) {
        int val = height(root);
        nthLevel(root, val);
        return value;
    }
}