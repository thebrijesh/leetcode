class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int totalSum = 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i]; 
        }
        int lsum = 0; int rsum = 0; int ans = 0;
        for(int i = 0; i < nums.length; i++){

            if(i != 0) lsum += nums[i-1];
            int lMulti = nums[i] * i;
            
            rsum = totalSum - (nums[i] + lsum);
            int rMulti = nums[i] * ((nums.length -i)-1);

            arr[i] = Math.abs(lsum - lMulti)+ Math.abs(rsum - rMulti);

        }
        return arr;
    }
}