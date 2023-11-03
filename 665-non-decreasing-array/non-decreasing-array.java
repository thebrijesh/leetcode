class Solution {
    public boolean checkPossibility(int[] nums) {
        int chance = 1;
        for(int i = 0; i < nums.length-1; i++){
           

            if(nums[i] > nums[i+1] ){
                
                chance--;
                if(chance < 0 || (i >= 1 && i < nums.length-2 && nums[i-1 ] > nums[i+1] && nums[i] > nums[i+2])) {

                    return false;
                }


            }
           
        }
        return true;
    }
}