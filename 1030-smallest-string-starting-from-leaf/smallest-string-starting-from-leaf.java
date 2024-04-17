class Solution {
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder  ans = new StringBuilder();
        helper(root, new StringBuilder(), ans);
        return ans.toString();
    }
    void helper(TreeNode root,StringBuilder str, StringBuilder ans) {
        if(root == null) return;
        str.append((char) (root.val + 'a'));
        if(root.left == null && root.right == null) {
            String curr = str.reverse().toString();
            if(ans.length() == 0 || curr.compareTo(ans.toString()) < 0) {
                ans.setLength(0);
                ans.append(curr);
            }
            str.reverse();
        }
            helper(root.left, str, ans);
            helper(root.right, str, ans);
            str.setLength(str.length() - 1);
    }
}