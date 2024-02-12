class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1; int max = Integer.MIN_VALUE;
        int val = nums[0];
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                count = 0;
            }
            count++;
            if(count > max){
                max = count;
                val = nums[i];
            }
        }
        return val;
    }
}