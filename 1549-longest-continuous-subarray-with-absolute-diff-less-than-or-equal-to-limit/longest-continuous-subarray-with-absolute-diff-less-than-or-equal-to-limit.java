class Solution {
    public  int longestSubarray(int[] nums, int limit) {
        int i = 0;
        int max = 0;
        int end = 0;
        while(i < nums.length){
            int start = i;
            int maxval = i;
            int minval = i;
             end = i;
            while(end < nums.length && ( Math.abs(nums[maxval] - nums[end]) <= limit && Math.abs(nums[minval] - nums[end]) <= limit) ){
                if(nums[maxval] <= nums[end]){
                    maxval = end;
                }
                if(nums[minval] >= nums[end]){
                    minval = end;
                }
                end++;
            }
            max = Math.max(max, end - start);
            if(end == nums.length)break;
            
            if (Math.abs(nums[maxval] - nums[end]) > limit) {
                i = maxval+1;
            }else if(Math.abs(nums[minval] - nums[end]) > limit){
                i = Math.max(i,minval+1);
            }
//            while(i < nums.length && Math.abs(nums[i] - nums[end])  > limit ){
//                i++;
//            }


        }

        return max;
    }
}