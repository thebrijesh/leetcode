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
    public void helper(TreeNode root){
        TreeNode left = root.right;
        TreeNode right = root.left;
        root.left = left;
        root.right = right;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        helper(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}