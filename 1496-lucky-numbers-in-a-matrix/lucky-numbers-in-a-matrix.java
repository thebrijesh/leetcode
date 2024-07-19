class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        Arrays.fill(row, Integer.MAX_VALUE);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                row[i] = Math.min(row[i],matrix[i][j]);
                col[j] = Math.max(col[j],matrix[i][j]);

            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < row.length; i++){
            for(int j = 0; j < col.length; j++){
                if(row[i] == col[j])ans.add(row[i]);
            }
        }

        return ans;
    }
}