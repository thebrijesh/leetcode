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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet();

        for (int[] arr : descriptions) {
            if (!map.containsKey(arr[0])) {
                map.put(arr[0], new TreeNode(arr[0]));
            }
            if (!map.containsKey(arr[1])) {
                map.put(arr[1], new TreeNode(arr[1]));

            }

            if (arr[2] == 1) {
                map.get(arr[0]).left = map.get(arr[1]);
               
            } else {
                
                map.get(arr[0]).right = map.get(arr[1]);
            }
            set.add(arr[1]);
           
        }

        for (int[] arr : descriptions) {
            if(!set.contains(arr[0]))return  map.get(arr[0]);
        }

        return null;

    }
}