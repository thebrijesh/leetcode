class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] array = new int[r][c];
        int k = 0;
        int l = 0;

        if(mat.length * mat[0].length != r * c){
            return mat;
        }

        for(int i = 0; i<mat.length; i++){
            for(int j =0; j<mat[i].length; j++){
                array[k][l] = mat[i][j];
                l++;
                if(l > c-1){
                    l=0;
                    k++;
                }
               
               
            }
        }
        return array;
    }
}