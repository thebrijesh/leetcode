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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> toBeDeleteNodes = new HashSet<>();
        List<TreeNode> result = new ArrayList<>();
        if(root==null)
            return result;
        for(int i: to_delete){
            toBeDeleteNodes.add(i);
        }
        delete(root, toBeDeleteNodes, result);
        if(!toBeDeleteNodes.contains(root.val))
            result.add(root);
        return result;
    }

    private TreeNode delete(TreeNode root, Set<Integer> toBeDeleteNodes, List<TreeNode> result){
        if(root==null)
            return null;
        root.left = delete(root.left, toBeDeleteNodes, result);
        root.right = delete(root.right, toBeDeleteNodes, result);
        if(toBeDeleteNodes.contains(root.val)){
            if(root.left!=null)
                result.add(root.left);
            if(root.right!=null)
                result.add(root.right);
            return null;
        }
        return root;
    }
}