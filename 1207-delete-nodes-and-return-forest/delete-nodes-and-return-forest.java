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
        List<TreeNode> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int val:to_delete){
            set.add(val);
        }
        if(!set.contains(root.val))list.add(root);
        solve(list,set,root);

        for(TreeNode roots : list){
            solve1(set,roots);
        }
        return list;
    }

    public void solve(List<TreeNode> list, HashSet<Integer> set,TreeNode root){
        if(root == null)return;

        if(set.contains(root.val)){
            if(root.left != null && !set.contains(root.left.val)){
                list.add(root.left);
            }
            if(root.right != null  && !set.contains(root.right.val)){
                list.add(root.right);
            }
        }

        solve(list,set,root.left);
        solve(list,set,root.right);
    }

    public void solve1(HashSet<Integer> set,TreeNode root){
        if(root == null)return;
        if(root.left != null && set.contains(root.left.val)){
            root.left = null;
        }
        if(root.right != null && set.contains(root.right.val)){
            root.right = null;
        }

        solve1(set,root.left);
        solve1(set,root.right);
    }
}