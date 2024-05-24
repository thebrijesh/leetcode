class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int count = 0;
        int ans = 0;

        for (int num : nums) {
            int val = num-1;
            if (!set.contains(val)) {
                
                count = 0;
                while (set.contains(val + 1)) {
                    count++;
                   
                    val += 1;
                }
                ans = Math.max(ans, count);
            }
           
            

        }

        return ans;
    }
}