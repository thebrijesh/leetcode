class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    int[] temp = {i , j};
                    queue.add(temp);
                }else{
                    mat[i][j] = -1;
                }
            }
        }

        while(!queue.isEmpty()){
            int i = queue.peek()[0];
            int j = queue.peek()[1];
            // if(i > 0 && j > 0 && i < mat.length-1 && j < mat[0].length-1){
            //     int left = mat[i][j-1];
            // }

            if(j > 0 && mat[i][j-1] == -1){
                mat[i][j-1] = mat[i][j]+1;
                // int[] temp = {i,j-1};
                queue.add(new int[]{i,j-1});
            }

            if( j < mat[0].length-1 && mat[i][j+1] == -1){
                mat[i][j+1] = mat[i][j]+1;
                int[] temp = {i , j+1};
                queue.add(temp);
            }
            
            if(i > 0 && mat[i-1][j] == -1){
                mat[i-1][j] = mat[i][j]+1 ;
                int[] temp = {i-1 , j};
                queue.add(temp);
            }

            if( i < mat.length-1 && mat[i+1][j] == -1){
                mat[i+1][j] = mat[i][j]+1;
                int[] temp = {i+1 , j};
                queue.add(temp);
            }

            queue.remove();
        }
        return mat;
    }
}