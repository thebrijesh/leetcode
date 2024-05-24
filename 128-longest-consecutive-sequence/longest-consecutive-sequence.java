class Solution {
    public int longestConsecutive(int[] nums) {
        // System.out.print(Arrays.toString(nums) + " ");
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int count = 0;
        int ans = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int val = num;
                count = 1;
                while (set.contains(val + 1)) {
                    count++;
                    val += 1;
                }
            }
           
            ans = Math.max(ans, count);

        }

        return ans;
    }
}