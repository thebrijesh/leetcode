class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, new Comparator<List<Integer>>() {
    @Override
    public int compare(List<Integer> list1, List<Integer> list2) {
        // Compare the first elements of the two inner lists in descending order
        return list1.get(0).compareTo(list2.get(0));
    }
});
       
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.size(); i++){
            for(int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++){
                set.add(j);
            }
        }
        return set.size();
    }
}