class Solution {
    public void setZeroes(int[][] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(nums[i][j] == 0){
                    set.add(i);
                    set2.add(j);
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
               
                if(set.contains(i) || set2.contains(j) ){
                    nums[i][j] = 0;
                }
            
            }
        }
    }
}