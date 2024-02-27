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
    public void helper(TreeNode root,int[]preSum){
        if(root == null)return;
        
       
        helper(root.right,preSum);
        root.val = preSum[0] + root.val;
        preSum[0] = root.val;
        helper(root.left,preSum);
        
    }
    public TreeNode convertBST(TreeNode root) {
        int[] preSum = new int[1];
        helper(root,preSum);
        return root;
    }
}