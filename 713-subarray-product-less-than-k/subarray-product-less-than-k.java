class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
int multi = 1; int start = 0; int counter =0;
        for(int i =0; i<nums.length; i++){
            multi  = multi * nums[i];
            
           

            while(multi >= k && start <=i ){
                
                 multi =  multi / nums[start];
                start++;
            }
              
            counter +=(i - start+1);
        }
        return counter;
    }
}