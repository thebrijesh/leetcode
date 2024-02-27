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
    int preSum = 0;
    public int helper(TreeNode root){
        if(root == null)return 0;
        
       
        helper(root.right);
        root.val = preSum + root.val;
        preSum = root.val;
        helper(root.left);
        return preSum;
    }
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }
}