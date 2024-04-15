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
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;

        TreeNode p = root;
        while ( p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);

                if (p.left != null && (p.left.left == null && p.left.right == null)) {
                    sum += p.left.val;
                }
                p = p.left;
            } else {

                TreeNode node = stack.pop();

                p = node.right;
            }
        }
        return sum;
    }
}