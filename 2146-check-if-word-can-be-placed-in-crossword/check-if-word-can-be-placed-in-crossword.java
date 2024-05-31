class Solution {
    public boolean placeWordInCrossword(char[][] arr, String word) {
        StringBuilder str = new StringBuilder(word);
        str.reverse();
        String word1 = str.toString();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != '#') {
                    if (canPlaceWordHorizontally(arr, word, i, j) || canPlaceWordVertically(arr, word, i, j) || 
                    canPlaceWordHorizontally(arr, word1, i, j) || canPlaceWordVertically(arr, word1, i, j)) {
                        return true;
                    }

                }

            }
        }
        


        return false;
    }

    public boolean canPlaceWordVertically(char[][] arr, String word, int i, int j) {
        if (i - 1 >= 0 && arr[i - 1][j] != '#') {
            return false;
        } else if (i + word.length() < arr.length && arr[i + word.length()][j] != '#') {
            return false;
        }
        for (int jj = 0; jj < word.length(); jj++) {
            if (i + jj >= arr.length) {
                return false;
            }

            if (arr[i + jj][j] == ' ' || arr[i + jj][j] == word.charAt(jj)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean canPlaceWordHorizontally(char[][] arr, String word, int i, int j) {
        if (j - 1 >= 0 && arr[i][j - 1] != '#') {
            return false;
        } else if (j + word.length() < arr[0].length && arr[i][j + word.length()] != '#') {
            return false;
        }
        for (int jj = 0; jj < word.length(); jj++) {
            if (j + jj >= arr[0].length) {
                return false;
            }

            if (arr[i][j + jj] == ' ' || arr[i][j + jj] == word.charAt(jj)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

}