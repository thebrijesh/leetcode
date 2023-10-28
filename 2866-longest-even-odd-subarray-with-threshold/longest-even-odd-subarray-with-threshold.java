class Solution {
      public static boolean thisIs(int i, int[] nums, int threshold) {
        if ((nums[i] % 2 )!= (nums[i + 1] % 2) && nums[i] <= threshold && nums[i + 1] <= threshold) {
            return true;
        } else {
            return false;
        }

    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
            int max = 0; int count = 1;
            for(int i =0; i < nums.length; i++){
                if(nums[i] % 2 == 0 && nums[i] <= threshold){
                    count = 1;
                    while(i < nums.length-1 && thisIs(i,nums,threshold)){
                        
                        i++;
                        count++;
                    }
                    max = Math.max(max,count);
                }
            }
        
return max;
       
    }
}