class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        boolean minFound = false, maxFound = false;
        int start = -1, minStart = 0, maxStart = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < minK || num > maxK) {
                minFound = false;
                maxFound = false;
                start = i;
            }
            if (num == minK) {
                minFound = true;
                minStart = i;
            }
            if (num == maxK) {
                maxFound = true;
                maxStart = i;
            }
            if (minFound && maxFound) {
                res += Math.max(0L,Math.min(minStart, maxStart) - start);
            }
        }
        return res;
    }
}