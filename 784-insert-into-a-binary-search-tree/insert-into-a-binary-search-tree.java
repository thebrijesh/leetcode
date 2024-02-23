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
    public void helper(TreeNode root, int val) {
        if (root == null)
            return;

        if (root.val > val) {
            TreeNode temp = new TreeNode(val);
            if (root.left == null)
                root.left = temp;
            helper(root.left, val);
        }
        if (root.val < val) {
            TreeNode temp = new TreeNode(val);

            if (root.right == null)
                root.right = temp;

            helper(root.right, val);
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
        }
        helper(root, val);
        return root;
    }
}