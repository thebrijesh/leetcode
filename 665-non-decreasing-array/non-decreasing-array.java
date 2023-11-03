class Solution {
    public boolean checkPossibility(int[] nums) {
        int chance = 1;
        for(int i = 0; i < nums.length-1; i++){
           

            if(nums[i] > nums[i+1] ){
                
                chance--;
                if(chance < 0)return false;
                if(i >= 1 && nums[i-1] > nums[i+1]){
                    nums[i+1] = nums[i];
                }else{
                    nums[i] = nums[i + 1];
                }


            }
           
        }
        return true;
    }
}