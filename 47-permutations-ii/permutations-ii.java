class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        permuteUnique(nums, new ArrayList<>(), new HashMap<Integer, Integer>(), result);
        return new ArrayList<>(result);
    }

    private void permuteUnique(int[] nums, List<Integer> combo, Map<Integer, Integer> indexes, Set<List<Integer>> result) {
        if (combo.size() == nums.length) {
            result.add(new ArrayList<>(combo));
            return;
        } 
            for (int i = 0; i < nums.length; i++) {
                if (!indexes.containsKey(i)) {
                    combo.add(nums[i]);
                    indexes.put(i, 1);
                    permuteUnique(nums, combo, indexes, result);
                    combo.remove(combo.size() - 1);
                    indexes.remove(i);
                }
            }
        
    }
}