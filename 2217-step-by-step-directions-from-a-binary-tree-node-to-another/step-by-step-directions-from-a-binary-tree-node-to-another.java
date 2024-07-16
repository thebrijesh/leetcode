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
    StringBuilder str1 =new StringBuilder();
    StringBuilder str2 =new StringBuilder();
    public String getDirections(TreeNode root, int startValue, int destValue) {
        findDest(root, startValue, destValue,new StringBuilder());
    

        

        for(int i = 0; i < Math.min(str1.length(), str2.length()); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                str1.deleteCharAt(i);
                str2.deleteCharAt(i);
                i--;
            }else{
                break;
            }
            
        }
        str1.replace(0,str1.length(),"U".repeat(str1.length()));
        str1.append(str2);
        return str1.toString();
    }
    

    public void findDest(TreeNode root, int startValue, int endValue,StringBuilder str){
        if(root == null)return;
        if(root.val == startValue){
            str1.append(str);
            
        }
        if(root.val == endValue){
            str2.append(str);
        }
        findDest(root.left,startValue, endValue, str.append("L"));
        str.deleteCharAt(str.length()-1);
        findDest(root.right, startValue, endValue, str.append("R"));
        str.deleteCharAt(str.length()-1);

    }
}