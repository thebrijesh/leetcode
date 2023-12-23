class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int idx = 0;
        solve(list,idx,nums);
        return ans;
    }

        public void solve(ArrayList<Integer> list, int idx, int[] nums){
        if(idx == nums.length){
            if(!ans.contains(list)){
                ans.add(new ArrayList<>(list));
            }
            
            return;
        }

        // exclude
        solve(list,idx+1,nums);

        //include
        list.add(nums[idx]);
        solve(list,idx+1,nums);
        list.remove(list.size()-1);
    }
}