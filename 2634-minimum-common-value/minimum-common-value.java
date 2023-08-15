class Solution {
   public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
int ans =-1;
        for (var num:nums1) {
            set.add(num);

        }
        System.out.println(set);

        for (var num:nums2) {
            if(set.contains(num)){
                ans =  num;
                break;
            }
        }
        
return ans ;
    }
}