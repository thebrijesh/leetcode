class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            int mid = 0;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.print(mid);

        }
       
        return false;
    }
}