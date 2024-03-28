class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int st = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.get(nums[i]) > k) {
                map.put(nums[st], map.getOrDefault(nums[st], 0) - 1);

                st++;
            }

            max = Math.max(max, (i - st) + 1);
        }
        return max;
    }
}