class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] check = new boolean[board.length][board[0].length];
        int id = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                    if (exist(board, word.toCharArray(), i, j, check, 0)) {
                        return true;
                    }
            }
        }
    return false;
    }

        public static boolean exist(char[][] board, char[] word, int i, int j, boolean[][] check, int idx) {
        if (idx == word.length) {
            return true;
        }
        if (i < board.length && i >= 0 && j < board[0].length && j >= 0) {
            if (board[i][j] != word[idx]) return false;
            if (check[i][j]) return false;
        } else {
            return false;
        }


        check[i][j] = true;

        if (exist(board, word, i, j + 1, check, idx + 1)) return true;

        if (exist(board, word, i + 1, j, check, idx + 1)) return true;

        if (exist(board, word, i, j - 1, check, idx + 1)) return true;

        if (exist(board, word, i - 1, j, check, idx + 1)) return true;

        check[i][j] = false;

        return false;
    }

}