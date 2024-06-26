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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inorderTraversal(root,list);
        return constructTree(list,0,list.size()-1);
    }

    public void inorderTraversal(TreeNode root,List<Integer> list) {
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;

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

    }

    public TreeNode constructTree(List<Integer> list,int start, int end){
        if(start > end)return null;

        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = constructTree(list,start, mid-1);
        root.right = constructTree(list,mid+1, end);

        return root;
    }
}