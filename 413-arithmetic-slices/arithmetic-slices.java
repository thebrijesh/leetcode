class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                    arr[i] = arr[i-1] + 1;
                    sum += arr[i];
            }
        }
        
        

        return sum;
    }
}