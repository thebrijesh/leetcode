class Solution {
    public int peakIndexInMountainArray(int[] nums) {
       
       
        
        int mid =0; int start = 0; int end = nums.length-1;
      
        for(int i =0; i<nums.length; i++){
            mid = start + (end - start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid+1;

            }else{
                end = mid;
            }
        }

        return start;
    }
}