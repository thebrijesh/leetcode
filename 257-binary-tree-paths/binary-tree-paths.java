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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        paths(root, res, new StringBuilder());
        return res;
    }

    public void paths(TreeNode root, List<String> res, StringBuilder path){
        if(root == null) return;
        int len = path.length();
        path.append(root.val);
        if(root.left == null && root.right == null){
            res.add(path.toString());
        } else {
            path.append("->");
            paths(root.left, res, path);
            paths(root.right, res, path);
        }
        path.setLength(len);
    }
}