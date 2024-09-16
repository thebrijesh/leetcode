class Solution {
    public int findMinDifference(List<String> timePoints) {
        int minMinit = 0;
        int[] arr = new int[timePoints.size()];
        int y = 0;
        for(String str : timePoints){
            
            int hour = Integer.parseInt(str.substring(0,2));
            int minit = Integer.parseInt(str.substring(3,5));

            int num = (hour * 60) + minit;
         
            arr[y++] = num;
        }

        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            ans = Math.min(ans, arr[i+1] - arr[i]);
        }

        return Math.min(ans,(24 * 60) - arr[arr.length - 1] + arr[0]); 


       

 
    }

    
}