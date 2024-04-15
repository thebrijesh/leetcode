class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrl = new ArrayList<>();
        if(root == null) return arrl;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            arrl.add(current.val);
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
        return arrl;
    }
}