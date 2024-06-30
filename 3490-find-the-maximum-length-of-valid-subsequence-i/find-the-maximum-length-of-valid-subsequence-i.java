class Solution {
    int odd = 0;
    int even = 0;
    public int maximumLength(int[] nums) {
        int eo = solve(nums, 0, true);
        int oe = solve(nums, 0, false);

        int max = Math.max(eo,oe);
         max = Math.max(max,Math.max(odd/2,even/2));

        return max;
    }

    public int solve(int[] nums, int idx, boolean pre) {
        if (idx >= nums.length)
            return 0;

        int take = 0;
        int notTake = 0;

        if (pre && nums[idx] % 2 != 0  || !pre && nums[idx] % 2 == 0 ) {
            take = 1 + solve(nums, idx + 1, nums[idx] % 2 == 0);
        }else{

            notTake = solve(nums, idx + 1, pre);
        }
        
       if(nums[idx] % 2 == 0)even++;
       else odd++;

        return Math.max(take, notTake);

    }
}