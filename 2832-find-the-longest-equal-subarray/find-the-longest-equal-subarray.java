class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {

        int n = nums.size(), left = 0, right = 0, ans = 0;
        int[] count = new int[n + 1];
        while (right < n) {
            if (right - left - ans > k)
               count[nums.get(left++)]--;  
               
            ans = Math.max(++count[nums.get(right++)], ans);   
        }
        
        return ans;
    }
}