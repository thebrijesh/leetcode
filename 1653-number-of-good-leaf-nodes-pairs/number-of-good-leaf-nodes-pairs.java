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
    int pair = 0;
    public int countPairs(TreeNode root, int distance) {
           Helper(root,distance);
           return pair;       
    }

    public int[] Helper(TreeNode root,int distance){
        if(root == null) return new int[distance + 1];
        if(root.left == null && root.right == null){
            int[] freq = new int[distance + 1];
            freq[0] = 1;
            return freq;
        }
        int[] left = Helper(root.left,distance);
        int[] right = Helper(root.right,distance);
        for(int i=1; i<=distance-1; i++){
            for(int j=1; j<=distance-i; j++){
              
                   pair += left[i-1] * right[j-1];
                
            }
        }
        int[] ans = new int[distance + 1];
        for(int i=1; i<ans.length; i++){
         
            ans[i] = left[i-1] + right[i-1];
        }
        return ans;
    }
}