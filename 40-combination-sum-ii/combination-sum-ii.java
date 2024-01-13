class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, target, 0, new ArrayList<Integer>(), ans);
        return ans;
    }

    public void findCombinations(int[] arr, int target, int index, ArrayList<Integer> nums, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList<Integer>(nums));
            return;
        }
        for(int i=index;i<arr.length;i++) {
            if( i > index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            nums.add(arr[i]);
            findCombinations(arr, target-arr[i], i+1, nums, ans);
            nums.remove(nums.size()-1);
        }
    }
}