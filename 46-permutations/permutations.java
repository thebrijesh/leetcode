class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutation = new ArrayList<>();
        function(new ArrayList<>(),nums,0,permutation);
        return permutation;
    }
    static void function(ArrayList<Integer> ways, int[] nums,int index,List<List<Integer>> permutation){
        ways = new ArrayList<>(ways);
        if(ways.size()==nums.length){
            permutation.add(ways);
        }
        else{
            for(int i = 0; i<=ways.size();i++){
                ways.add(i,nums[index]);
                function(ways, nums, ++index,permutation);
                ways.remove(i);
                index = index-1;
            }
        }
  
    }
}