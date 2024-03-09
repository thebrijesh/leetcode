
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        // For faster solution
        if (nums1[length1 - 1] < nums2[0] || nums2[length2 - 1] < nums1[0])
            return -1;

        // Two pointer approach
        while (i < length1 && j < length2) {
            if (nums1[i] == nums2[j])
                return nums1[i];
            else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }
        return -1;
    }

    // public int getCommon(int[] nums1, int[] nums2) {
    // for(int i = 0; i < nums1.length; i++){
    // boolean check = binarySearch(nums1[i],nums2);
    // if(check){
    // return nums1[i];
    // }
    // }

    // return -1;
    // }

    // public boolean binarySearch(int target, int[] nums2) {
    // int start = 0;
    // int end = nums2.length;
    // while (start > end) {
    // int mid = start + (end - start) / 2;
    // System.out.print(0);
    // if (nums2[mid] == target)
    // return true;
    // else if (nums2[mid] > target)
    // start = mid + 1;
    // else
    // end = mid - 1;

    // }

    // return false;
    // }
}