class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.'){
                    for(int k = 0; k < board[i].length; k++){
                        if(board[i][j] == board[i][k] && j != k ){
                            return false;
                        }
                    }

                    for(int k = 0; k < board.length; k++){
                        if(board[k][j] == board[i][j] && i != k ){
                            return false;
                        }
                    }

                    int x = i / 3 * 3;
                    int y = j / 3 * 3;

                    for(int l = x; l < x + 3; l++){
                        for(int m = y; m < y + 3; m++){
                            if(board[i][j] == board[l][m] && (i != l || j != m) ){
                                return false;
                            }
                        }
                    }

                }

            }
        }
        return true;
    }
}