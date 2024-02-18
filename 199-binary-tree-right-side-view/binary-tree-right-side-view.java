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
    public static int height(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void preOrder(TreeNode root, List<Integer> ans, int level){
        if(root == null){
            return;
        }
        ans.set(level-1,root.val);
        preOrder(root.left,ans,level+1);
        preOrder(root.right,ans,level+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        int level = height(root) + 1;
        for(int i = 0; i < level; i++){
            ans.add(100);

        }
        preOrder(root,ans,1);
        return ans;
    }
}