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
    // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //     List<List<Integer>> list2D = new ArrayList<>();
    //     int level = 1;
    //     int count = 1;
    //     int nextNull = 0;
    //     int currNull = 0;
    //     int l = 1;

    //     Queue<TreeNode> queue = new LinkedList<>();
    //     if (root != null)
    //         queue.add(root);
    //     List<Integer> list = new ArrayList<>();
    //     while (!queue.isEmpty()) {
    //         TreeNode temp = queue.peek();

    //         if (temp.left != null) {
    //             queue.add(temp.left);
    //         } else {
    //             nextNull++;
    //         }
    //         if (temp.right != null) {
    //             queue.add(temp.right);
    //         } else {
    //             nextNull++;
    //         }
    //         if (l % 2 == 0) {
    //             list.add(0, temp.val);
    //         } else {
    //             list.add(temp.val);
    //         }

    //         if (level == count + currNull) {
    //             list2D.add(list);
    //             list = new ArrayList<>();
    //             level = level * 2;
    //             count = 0;
    //             currNull = nextNull;
    //             nextNull *= 2;
    //             l++;
    //         }
    //         queue.remove();
    //         count++;
    //     }

    //     return list2D;
    // }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list2D = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);
        
        int level = 0;
         while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while(size-- > 0){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                if(level % 2 == 0){
                    list.add(queue.remove().val);
                }else{
                    list.add(0,queue.remove().val);
                }
                
            }

            list2D.add(list);
            level++;
         }
return list2D;
    }
}
