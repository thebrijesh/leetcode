class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char num = board[i][j];
                if (num != '.') {
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
                }
            }
        }
        return true;
    }

    // public void display(char[][] board) {
    //     int count = 0;
    //     int count1 = 0;
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board[i].length; j++) {

    //             System.out.print(board[i][j] + " ");
    //             count++;

    //             System.out.print("| ");

    //         }
    //         System.out.println();
    //     }
    // }
}