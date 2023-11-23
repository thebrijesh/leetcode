class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
        }
        int zeroes = 0; int swapes = 0;
        for(int i = 0; i < count; i++){
            if(nums[i] == 0){
                zeroes++;
            }
            
        }
        swapes = zeroes;
        
        for(int i = count; i < nums.length; i++){
            if(nums[i-count] == 0){
                zeroes--;
            }
            if(nums[i] == 0){
                zeroes++;
            }
            swapes = Math.min(swapes,zeroes);
        }
        int j =0;int k = nums.length - count;
        for(int i = 0; i < count-1; i++){
            if(nums[j++] == 0)zeroes++;
            if(nums[k++] == 0)zeroes--;
            swapes = Math.min(swapes,zeroes);
        }
        return swapes;
        
    }
}