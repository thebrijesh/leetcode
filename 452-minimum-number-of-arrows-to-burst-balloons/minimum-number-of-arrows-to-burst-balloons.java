class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(o -> o[0]));
        int count = 0;
        if(points.length == 1)return 1;
        for(int i =1 ; i < points.length; i++){
            
            int num = points[i-1][1];
            
            while(i < points.length && num >= points[i][0]) {
                if(num >= points[i][1] ) num  = points[i][1]; 
                i++;
            }
            if(i == points.length-1){
                count++;
            }

            count++;
        }
        
        return count;
    }
    
}