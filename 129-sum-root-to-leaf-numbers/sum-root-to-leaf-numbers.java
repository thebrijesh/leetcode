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
    public int sumNumbers(TreeNode root) {
        
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sum = 0;
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current.right != null) {
                current.right.val += current.val * 10 ;
                stack.push(current.right);
            }
            if (current.left != null) {
                current.left.val += current.val * 10 ;
                stack.push(current.left);
            }
            if(current.right == null && current.left == null){
                sum+= current.val;
            }

        }
        return sum;

    }
}