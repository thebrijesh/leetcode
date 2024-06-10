class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        solve(map,set,new ArrayList<>(),nums,0);
        for(List<Integer> l : set){
            ans.add(l);
        }
        return ans;
    }

    public void solve(HashMap<Integer, Integer> map, HashSet<List<Integer>>ans , List<Integer> list, 
                        int[] nums, int idx){
        if(idx == nums.length){
            
                ans.add(new ArrayList(list));
            
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) > 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                list.add(nums[i]);
                solve(map,ans,list,nums,idx+1);
                list.remove(list.size()-1);
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            }

        }
    }
}