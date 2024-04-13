class Solution {
    public int largestRectangleArea(int[] height) {

        int[] arr = new int[height.length];
        arr[height.length - 1] = height.length;
        for (int i = height.length - 2; i >= 0; i--) {
            int temp = i + 1;
            while (temp < height.length && height[temp] >= height[i])
                temp = arr[temp];

            arr[i] = temp;

        }
        int[] arr1 = new int[height.length];
        arr1[0] = -1;
        
        int ans = 0;
         ans = Math.max(ans, (Math.abs(((arr[0] - 1) - (arr1[0] + 1) + 1))) * height[0]);

        for (int i = 1; i < height.length; i++) {
            int temp = i - 1;
            while (temp >= 0 && height[temp] >= height[i])
                temp = arr1[temp];

            arr1[i] = temp;
             ans = Math.max(ans, (Math.abs(((arr[i]) - (arr1[i] + 1)))) * height[i]);
        }
       System.out.println("arr1 " + Arrays.toString(arr1));
        System.out.println("arr " + Arrays.toString(arr));

        return ans;
    }
}