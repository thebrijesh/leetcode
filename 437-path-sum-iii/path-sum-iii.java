// class Solution {
//     int counter = 0;
//     public int pathSum(TreeNode root, int sum) {

//         if (root == null) return 0;

//         pathSumHelper(root, sum, 0);
//         pathSum(root.left, sum);
//         pathSum(root.right, sum);

//         return counter;

//     }

//     void pathSumHelper(TreeNode root, int sum, int currentSum) {
//         if (root == null) {
//             return;
//         }
//         currentSum += root.val;
//         if (currentSum == sum) {
//             counter++;
//         }
//         pathSumHelper(root.left, sum, currentSum);
//         pathSumHelper(root.right, sum, currentSum);
//     } 
// }
class Solution{
    public int pathSum(TreeNode root, int sum) {
        int curCount = isMeetSum(root, sum);
        if (root == null) {
            return 0;
        }

        return curCount + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int isMeetSum(TreeNode root, long sum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if ((long)(root.val) == sum) {
            count++;
        }
        return count + isMeetSum(root.left, sum - (long)(root.val)) + isMeetSum(root.right, sum - (long)(root.val));
    }
}