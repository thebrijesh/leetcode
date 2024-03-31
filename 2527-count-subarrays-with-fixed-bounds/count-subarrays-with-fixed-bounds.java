class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;

        int start = -1, minStart = -1, maxStart = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < minK || num > maxK) {

                start = i;
            }
            if (num == minK) {

                minStart = i;
            }
            if (num == maxK) {

                maxStart = i;
            }

            res += Math.max(0L, Math.min(minStart, maxStart) - start);

        }
        return res;
    }
}