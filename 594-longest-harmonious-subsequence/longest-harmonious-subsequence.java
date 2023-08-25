class Solution {
//    public static int findLHS(int[] nums) {
//         int max = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int count = 0;
//             int count1 = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//                 if (nums[i] + 1 == nums[j]) {
//                     count1++;
//                 }
//             }
//             if (count1 != 0) {
//                 max = Math.max(max, count + count1);
//             }
//         }
//         return max;
//     }

  public static int findLHS(int[] nums){
        Arrays.sort(nums);
        int max =0;
        int count = 0; int count1 = 0; int start =0;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[start] - nums[i]) < 2 ){
                if (nums[start] - nums[i] == 0){
                    count++;
                }else {
                    count1++;
                }
            }else {
                if (count != 0 && count1 !=0){
                    max = Math.max(max, count + count1);
                }
                if (nums[i]  - nums[i-1] ==1){
                    start = i-1;
                    count = count1;
                    count1 =1;
                }else {
                    start = i;
                    count = 1;
                    count1 =0;
                }


            }



        }
        if (count != 0 && count1 !=0){
            max = Math.max(max, count + count1);
        }
        return max;

    }
}