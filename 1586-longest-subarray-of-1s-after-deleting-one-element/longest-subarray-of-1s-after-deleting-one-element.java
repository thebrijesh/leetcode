class Solution {
    public int longestSubarray(int[] nums) {
        int current = 0;
        int max = 0;
        int pre =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                 max = Math.max(max,pre + current);
                pre = current;
                current = 0;
            }else{
                current++;
               
            }
        }
 max = Math.max(max,pre + current);
        if(current == nums.length){
            return current-1;

        }
        return max;
    }
}