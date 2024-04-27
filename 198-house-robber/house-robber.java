class Solution {
    public int rob(int[] nums) {
        if(nums.length == 2)return Math.max(nums[0],nums[1]);
        if(nums.length == 1)return nums[0];
        int sum = 0; int max = 0;
        for(int i = 2; i < nums.length; i++){
            max = Math.max(max,nums[i-2]);
            int temp = nums[i-1];
            int val = nums[i-2];
            sum = max + nums[i];

            nums[i] = Math.max(temp,sum);

        }
        return nums[nums.length-1];
    }
}