class Solution {
    public int minPatches(int[] nums, int n) {
        long sum = 1; 
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum>= nums[i]){
                sum+= nums[i];
            }else{
                sum *= 2;
                count++;
                i--;
            }

            if(sum > n)return count;

        }
 while(sum <= n){
            sum *= 2;
            count++;
            
        }
       
        return count;
    }
}