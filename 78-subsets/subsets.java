class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());

        for (int j : nums) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> i : arr) {
                List<Integer> subset = new ArrayList<>(i);
                subset.add(j);
                temp.add(subset);
            }
            arr.addAll(temp);
        }
        return arr;
    }
}