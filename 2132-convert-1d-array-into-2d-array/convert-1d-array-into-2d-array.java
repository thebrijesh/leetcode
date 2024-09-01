class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
    if(m * n < original.length)return new int[0][0];
    if(m * n > original.length)return new int[0][0];
        int track = 0;
        int[][] arr = new int[m][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(track < original.length){
                    arr[i][j] = original[track++];
                }
                
            }
        }

        return arr;
    }
}