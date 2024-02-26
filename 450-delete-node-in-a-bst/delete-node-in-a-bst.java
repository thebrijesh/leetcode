/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val > val) root.left = deleteNode(root.left, val);
        else if (root.val < val) root.right = deleteNode(root.right, val);
        else {
            if (root.left != null && root.right != null) {
                int lMax = max(root.left);
                root.val = lMax;
                root.left = deleteNode(root.left, lMax);
            } else if (root.left != null) {
                root = root.left;

            } else if (root.right != null) {
                root = root.right;

            } else {
                root = null;
            }


        }

        return root;
    }
    private int max(TreeNode root) {
        if (root.right != null) {
            return max(root.right);
        } else {
            return root.val;
        }
    }
}