class Solution {
public static int  triangularSum(int[] nums) {
        int pre = nums[0];
        for(int i =1; i < nums.length; i++){
            for(int j = i; j < nums.length;  j++){
                if(nums[j] != -1){
                    int curr = nums[j];
                    nums[j] = nums[j] + pre;
                    if(nums[j] + pre > 9){
                        nums[j] = nums[j] % 10;
                    }
                    pre = curr;
                }

            }
            pre = nums[i];
            nums[i-1] = -1;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != -1){
                return nums[i];
            }
        }
        return 0;
    }
}
