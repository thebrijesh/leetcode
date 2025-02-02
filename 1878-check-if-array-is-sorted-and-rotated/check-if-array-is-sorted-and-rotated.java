class Solution {
    public boolean check(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        
        boolean tf = false;
        int min = Integer.MAX_VALUE, max = 0;

        for(int i=0;i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        if(nums[0] != min && nums[nums.length-1] != max){
            if(nums[0] < nums[nums.length-1]){
                return false;
            }
        }

        for(int i=0;i<nums.length-1; i++){
            if(nums[i] <= nums[i+1]){
                tf = true;
            } else if(nums[i] == max && nums[i+1] == min){
                tf = true;
            } else{
                tf = false;
                break;
            }
        }
        
        return tf;
    }
}