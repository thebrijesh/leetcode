class Solution {
  
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
       int[][] grid = new int[26][26];
        int n = 26;
        long ans = 0;
       for (int i = 0; i < 26; i++) {
            Arrays.fill(grid[i], Integer.MAX_VALUE/2);
        }
         for (int i = 0; i < 26; i++) {
            grid[i][i] = 0;
        }

        for(int i = 0; i < cost.length; i++){
            int from = original[i]-'a';
            int to = changed[i] - 'a';
            grid[from][to] = Math.min(grid[from][to],cost[i]);
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (grid[i][k] < Integer.MAX_VALUE/2) {
                    for (int j = 0; j < n; j++) {
                        if (grid[k][j] < Integer.MAX_VALUE/2) {
                            grid[i][j] = Math.min(grid[i][j], grid[i][k] + grid[k][j]);
                        }
                    }
                }
            }
        }

        for(int i = 0; i < source.length(); i++){
            int raw = source.charAt(i) - 'a';
            int col = target.charAt(i) - 'a';
            if(raw != col){
                if(grid[raw][col] == Integer.MAX_VALUE/2){
                return -1L;
            }
                ans += grid[raw][col];
            }
            
        }


        return ans;
    }
}