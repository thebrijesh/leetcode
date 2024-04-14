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
    public int sumOfLeftLeaves(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        int sum = 0;
       
        TreeNode p = root;
        while(p != null || !q.isEmpty()){
            if(p!= null){
                q.push(p);
                
                if(p.left!= null  && (p.left.left == null && p.left.right == null)){
                    sum += p.left.val;
                }
                p = p.left;
            }else{
                
                TreeNode node = q.pop();
                
                
                p = node.right;
            }
        }
        return sum;
    }
}