class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    int i = 0, j = 0;
    while(i < nums1.length && j < nums2.length ){
        if(nums1[i] == nums2[j]) return nums1[i];
        if(nums1[i] > nums2[j]) j++;
        else i++;
    }
    return -1;
}
    // public int getCommon(int[] nums1, int[] nums2) {
    //     for(int i = 0; i < nums1.length; i++){
    //         boolean check = binarySearch(nums1[i],nums2);
    //         if(check){
    //             return nums1[i];
    //         }
    //     }
            
    //     return -1;
    // }

    // public boolean binarySearch(int target, int[] nums2) {
    //     int start = 0;
    //     int end = nums2.length;
    //     while (start > end) {
    //         int mid = start + (end - start) / 2;
    //        System.out.print(0);
    //         if (nums2[mid] == target)
    //             return true;
    //         else if (nums2[mid] > target)
    //             start = mid + 1;
    //         else
    //             end = mid - 1;

    //     }
        
    //     return false;
    // }
}