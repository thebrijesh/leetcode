class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 1;
        int end = (position[position.length-1] - position[0])/(m-1);
        if(m==2)return end;
        int result = 0;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(posibleToPlace(mid,position,m)){
                result = mid;
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        return result;
    }

    public boolean posibleToPlace(int mid, int[] position, int m){
        int prev = position[0];
        int ballCount = 1;

        for(int i = 0; i < position.length; i++){
            int curr = position[i];

            if(curr - prev >= mid){
                ballCount++;
                prev = curr;
            }

            if(ballCount==m)break;
        }
        return ballCount==m;
    }
}