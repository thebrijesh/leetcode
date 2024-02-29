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
    List<Integer> list = new ArrayList<>();

    public TreeNode pred(TreeNode curr1) {
        TreeNode curr = curr1.left;
        TreeNode pred = curr1;
        while (curr.right != null && curr.right != pred) {
            curr = curr.right;
        }
        if (curr.right == null) {
            curr.right = pred;
            pred = pred.left;
        }

        if (curr.right == pred) {
            curr.right = null;
            list.add(pred.val);
            pred = pred.right;
        }
        return pred;
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        TreeNode curr1 = root1;
        TreeNode curr2 = root2;

        while (curr1 != null && curr2 != null) {
            if (curr1.left != null) {

                curr1 = pred(curr1);

            } else {
                list.add(curr1.val);
                curr1 = curr1.right;
            }
            if (curr2.left != null) {

                curr2 = pred(curr2);

            } else {
                list.add(curr2.val);
                curr2 = curr2.right;
            }
        }
        while (curr1 != null) {
            if (curr1.left != null) {

                curr1 = pred(curr1);

            } else {
                list.add(curr1.val);
                curr1 = curr1.right;
            }

        }

        while (curr2 != null) {
            if (curr2.left != null) {

                curr2 = pred(curr2);

            } else {
                list.add(curr2.val);
                curr2 = curr2.right;
            }
        }
        Collections.sort(list);
        return list;
    }
}