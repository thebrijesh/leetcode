class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0; int start =0; double max =Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            if(i >= k-1){
             max = Math.max(max,sum/k);
                sum = sum - nums[start];
                start++;
            
               
            }
               
            
        }
        return max;
    }
}