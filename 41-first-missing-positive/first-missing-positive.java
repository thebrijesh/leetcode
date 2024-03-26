class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums.length || nums[i] <= 0){
                continue;
            }
            while(i+1 != nums[i]){
                int j = nums[i];
                int k = nums[j-1];
                if(j == k)break;
                int temp = j;
                nums[i] = k;
                nums[j-1] = temp;
                if(nums[i] > nums.length || nums[i] <= 0){
                    break;
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i+1 == nums[i])ans = nums[i];
            else break;
        }
        return ans+1;
    }
}