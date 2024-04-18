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
    public void recoverTree(TreeNode root) {
        TreeNode curr = root, first = null, second = null;
        TreeNode pre = null;
        while (curr != null) {

            System.out.println(curr.val);
            if (curr.left == null) {
                if (pre != null  && curr.val < pre.val) {
                        if (first == null) {
                            first = pre;
                        }
                        second = curr;
                    }
                    pre = curr;
                curr = curr.right;
            } else {
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                    continue;
                }else {
                    pred.right = null;
                    if (pre != null  && curr.val < pre.val) {
                        if (first == null) {
                            first = pre;
                        }
                        second = curr;
                    }
                    pre = curr;
                    curr = curr.right;
                }
            }

        }
        int temp = second.val;
        second.val = first.val;
        first.val = temp;
    }

}