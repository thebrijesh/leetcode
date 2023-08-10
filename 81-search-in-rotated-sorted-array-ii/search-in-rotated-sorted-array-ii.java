class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0; int end = nums.length-1;
        for(int i= 0; start<=end; i++){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return true;
            }

            if(nums[start] == nums[mid] && nums[end] == nums[mid]){
                start++;
                end--;
            }else if(nums[end] == nums[mid]){
                end = mid-1;
            }else if(nums[start] == nums[mid]){
                start = mid+1;
            }else {

                if(nums[mid]<nums[end]){
                    if(target>=nums[mid] && target <= nums[end]){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }else{
                    if(target<=nums[mid] && target >= nums[start]){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }

                

            

                // if(nums[mid]<target){
                // start = mid +1;
                // }else{
                // end = mid -1;
                // }
            
            }
            
            
        }

       return false;
    }
}