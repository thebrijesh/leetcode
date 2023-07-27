class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);

        int smallestMissing = 1;
        for (int num : nums) {
            if (num == smallestMissing) {
                smallestMissing++;
            }
        }
        
        return smallestMissing;
            }
           
            
        


    }