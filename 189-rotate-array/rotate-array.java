class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverce(nums,0,nums.length-1);
        reverce(nums,0,k-1);
        reverce(nums,k,nums.length-1);

        
    }

    public void reverce(int[] nums,int firstIndex, int lastIndex){
        for(int i = firstIndex; i < lastIndex; i++){
            int temp = nums[i];
            nums[i] = nums[lastIndex];
            nums[lastIndex] = temp;
            lastIndex--;
        }
    }

    
}