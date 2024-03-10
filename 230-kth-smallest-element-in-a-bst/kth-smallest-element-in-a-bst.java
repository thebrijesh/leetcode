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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        List<Integer> list = new ArrayList<>();
        while(curr != null){
            if(curr.left != null){
                TreeNode pred =curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                if(pred.right == curr){
                    pred.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }else{
                list.add(curr.val);
                curr = curr.right;
            }
        }
        System.out.print(list);
        return list.get(k-1);
    }
}