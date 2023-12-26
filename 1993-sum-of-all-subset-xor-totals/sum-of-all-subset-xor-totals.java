class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        solve(nums,0,0);
        return sum;
    }

    public void solve(int[] nums, int val, int idx){
        if(idx == nums.length){
            sum += val;
            return;
        }
        solve(nums,val ^ nums[idx],idx+1);

        solve(nums,val,idx+1);
    }
}