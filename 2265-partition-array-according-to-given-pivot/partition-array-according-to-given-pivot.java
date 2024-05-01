class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int min = 0, max = 0, equal = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                min++;
            }else if(nums[i] > pivot){
                max++;
            }else{
                equal++;
            }
        }
        int[] ans = new int[nums.length];
        int i = 0; int j = min; int k = min + equal;
        for(int num : nums){
            if(num < pivot){
                ans[i++] = num;
            }else if(num == pivot){
                ans[j++] = num;
            }else{
                ans[k++] = num;
            }
        }

        return ans;
    }
}