class Solution {

    char[][] ans = new char[9][9];

    public void solveSudoku(char[][] board) {
        // for(int i = 0; i < board.length; i++){
        // for(int j = 0; j < board[i].length; j++){
        // if(board[i][j] != '.' ){
        // helper(board,i,j);
        // }
        // }
        // }

        helper(board, 0, 0);
        for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j] = ans[i][j];
                }
            }
    }

    public void helper(char[][] board, int r, int c) {
        if (r >= board.length) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    ans[i][j] = board[i][j];
                }
            }

            return;
        }

        int nr = 0;
        int nc = 0;

        if (c == board[0].length - 1) {
            nr = r + 1;
            nc = 0;
        } else {
            nr = r;
            nc = c + 1;
        }
        if (board[r][c] != '.') {
            helper(board, nr, nc);
        } else {
            for (int i = 1; i < 10; i++) {
                if (isValidSudoku(board, r, c, i)) {
                    board[r][c] = (char) (i + '0');
                    helper(board, nr, nc);
                    board[r][c] = '.';
                }
            }
        }

    }

    public boolean isValidSudoku(char[][] board, int i, int j, int value) {
        char num = (char) (value + '0');
        for (int k = 0; k < board.length; k++) {

            if ((k != j && board[i][k] == num) || (k != i && board[k][j] == num)) {
                return false;
            }
        }

        int x = i / 3 * 3;
        int y = j / 3 * 3;

        for (int l = x; l < x + 3; l++) {
            for (int m = y; m < y + 3; m++) {
                if ((l != i || m != j) && num == board[l][m]) {
                    return false;
                }
            }
        }

        return true;
    }
}