class Solution {
    int[][] dp ;
    public int minHeightShelves(int[][] books, int shelfWidth) {
        dp  = new int[1001][1001];
        return solve(books,0,shelfWidth,shelfWidth, 0);
    }
    
    public int solve(int[][] books, int idx, int width, int remainWith, int maxHight){
        if(idx >= books.length)return maxHight;
        if(dp[idx][remainWith] != 0){
            return dp[idx][remainWith];
        }
        int bookHight = books[idx][1];
        int bookWith = books[idx][0];
        int currRow = Integer.MAX_VALUE;
        int nextRow = Integer.MAX_VALUE;
        if(bookWith <= remainWith){
            currRow = solve(books,idx+1,width,remainWith - bookWith, Math.max(maxHight, bookHight));
        }

        nextRow = maxHight + solve(books,idx+1,width, width - bookWith,bookHight);

        return dp[idx][remainWith] = Math.min(currRow, nextRow);
    }
}