class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr); int count = 1;
        // 1,1,2,2,2 = i - (i -1) is 0 and 1
        //100,100,1000,1000,1000 = i - (i-1) is 0 and 900
        if(arr[0] != 1) arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            if( arr[i] - arr[i-1] > 1){
                arr[i] = arr[i-1] +1;
            }
        }
        


        return arr[arr.length-1];
    }
}