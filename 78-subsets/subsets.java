class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int idx = 0;
        solve(list, idx, nums);
        return ans;
    }

    public void solve(ArrayList<Integer> list, int idx, int[] nums) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        // exclude
        solve(list, idx + 1, nums);

        // include
        list.add(nums[idx]);
        solve(list, idx + 1, nums);
        list.remove(list.size() - 1);
        

    }
}