class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        
        combinationSum(candidates, target, list, new ArrayList<>(), 0, 0);
        return list;
    }

    public void combinationSum(int[] candidates, int target, List<List<Integer>> list2d, List<Integer> list, int start, int sum) {
        if (sum > target) return;
        else if (sum == target) list2d.add(new ArrayList<>(list));
        else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                combinationSum(candidates, target, list2d, list, i, sum + candidates[i]);
                list.remove(list.size() - 1);
            }
        }


    }

}