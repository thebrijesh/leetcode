class Solution {
     List<List<String>> list = new ArrayList<>();

    public  List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        return solve(board, 0);

    }

        public boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        //check row

        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q') return false;
        }
        //check col
        for (char[] chars : board) {
            if (chars[col] == 'Q') return false;
        }
        // check left up to stand diagonal
        int i = row;
        int j = col;

        while (i >= 0 && j >= 0) {
            if (board[i--][j--] == 'Q') return false;
        }
        // check stand  to right down diagonal
        i = row;
        j = col;

        while (i < n && j < n) {
            if (board[i++][j++] == 'Q') return false;
        }

        // check right up to stand diagonal
        i = row;
        j = col;

        while (i >= 0 && j < n) {
            if (board[i--][j++] == 'Q') return false;
        }

        // check stand to left down diagonal
        i = row;
        j = col;

        while (i < n && j >= 0) {
            if (board[i++][j--] == 'Q') return false;
        }
        return true;
    }

        public List<List<String>> solve(char[][] board, int row) {
        int n = board.length;
        if (n == row) {
            List<String> list1 = new ArrayList<>();
            for (char[] chars : board) {
                StringBuilder s = new StringBuilder();

                    s.append(chars);


                list1.add(s.toString());
            }
            list.add(list1);
            return list;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                solve(board, row + 1);
                board[row][i] = '.';
            }
        }

        return list;
    }


}