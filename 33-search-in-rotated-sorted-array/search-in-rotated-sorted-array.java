class Solution {
    public static int search(int[] nums, int target) {
       int start = 0;
        int end = nums.length-1;
        int n = end;
        int mid;

        while(start <= end){
            mid = start + (end -start)/2;

            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] >= nums[start]){
                if(nums[start] <= target && nums[mid] > target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                 if(nums[mid] < target && nums[end] >= target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        
        return -1;
    }

}