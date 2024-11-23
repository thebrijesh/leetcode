class Solution {
    public char[][] rotateTheBox(char[][] box) {
       
        int row = box.length;
        int col = box[0].length;
        char[][] ans = new char[col][row];
        for(int i= 0; i < row; i++){
            int k = col-1;
            for(int j = col-1; j >= 0; j--){

                if(box[i][j] == '*'){
                    k = j-1;
                }else if(box[i][j] == '#'){
                    box[i][j] ='.';
                    box[i][k--] ='#';
                }

              
            }
        }
        for(int i= 0; i < row; i++){
            
            for(int j = 0; j< col; j++){

                ans[j][row-i-1] = box[i][j]; 

              
            }
        }
        return ans;
    }
}