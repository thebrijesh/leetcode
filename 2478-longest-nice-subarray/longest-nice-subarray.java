class Solution {
    public int longestNiceSubarray(int[] nums) {
        int res = 0; int max = 1; int j = 0;

        for(int i = 0; i < nums.length; i++){
            if((res & nums[i]) == 0){
                res ^= nums[i];
                max = Math.max(max, i - j +1);
            }else{
                res ^= nums[j++];
                i--;
            }

        }
        return max;
    }
}