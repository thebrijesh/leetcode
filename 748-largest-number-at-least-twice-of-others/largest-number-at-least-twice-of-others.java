class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int idx =0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
                idx = i;

            }else if(nums[i] > secondMax && secondMax != max){
                secondMax = nums[i];
            }
        }

       
       
        return  (max>=secondMax*2)?idx:-1;
    }
}