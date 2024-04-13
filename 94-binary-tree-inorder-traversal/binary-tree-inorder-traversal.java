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

    // public List<Integer> inorderTraversal(TreeNode root) {
    // List<Integer> list = new ArrayList<>();
    // TreeNode curr = root;
    // while (curr != null) {
    // if (curr.left != null) {
    // TreeNode pred = curr.left;
    // while (pred.right != null && pred.right != curr) {
    // pred = pred.right;
    // }
    // if (pred.right == null) {
    // pred.right = curr;
    // curr = curr.left;
    // }
    // if (pred.right == curr) {
    // pred.right = null;
    // list.add(curr.val);
    // curr = curr.right;
    // }
    // } else {

    // list.add(curr.val);
    // curr = curr.right;

    // }
    // }
    // return list;
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val); // Add after all left children
                p = node.right;
            }
        }
        return result;
    }
}