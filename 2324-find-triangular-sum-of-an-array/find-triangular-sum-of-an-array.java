class Solution {
public static int  triangularSum(int[] nums) {
        int pre = nums[0];
        for(int i =1; i < nums.length; i++){
            for(int j = i; j < nums.length;  j++){
                int curr = nums[j];
                nums[j] = (nums[j] + pre) % 10;
                pre = curr;

            }
            pre = nums[i];
        }
     
        return nums[nums.length-1];
    }
}
