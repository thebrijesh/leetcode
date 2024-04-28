class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        dungeon[m-1][n-1] = Math.max(1 -dungeon[m-1][n-1],1 );
        for(int i = m-2; i >=0; i--){
            dungeon[i][n-1] = Math.max(dungeon[i+1][n-1] - dungeon[i][n-1] ,1 );
        }

        for(int j =n-2; j >= 0; j-- ){
            dungeon[m-1][j] = Math.max(dungeon[m-1][j+1] - dungeon[m-1][j] ,1 );
        }
        for(int i = m-2; i >=0; i--){
            for(int j =n-2; j >= 0; j-- ){
                int down = Math.max(dungeon[i+1][j] - dungeon[i][j] ,1 );
                int right = Math.max(dungeon[i][j+1] - dungeon[i][j] ,1 );

                dungeon[i][j] = Math.min(down,right);
            }
        }
        return dungeon[0][0];
    }
}