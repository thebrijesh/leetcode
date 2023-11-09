class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, new Comparator<List<Integer>>() {
    @Override
    public int compare(List<Integer> list1, List<Integer> list2) {
        // Compare the first elements of the two inner lists in descending order
        return list1.get(0).compareTo(list2.get(0));
    }
});
        int count = (nums.get(0).get(1) - nums.get(0).get(0))+1;
        int max = nums.get(0).get(1);
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i).get(0) <= max && max < nums.get(i).get(1)){
                count += nums.get(i).get(1) - max;
                max = nums.get(i).get(1);
            }else if(nums.get(i).get(0) > max){
                count += (nums.get(i).get(1) - nums.get(i).get(0))+1;
                max = nums.get(i).get(1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.size(); i++){
            for(int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++){
                set.add(j);
            }
        }
        return set.size();
    }
}