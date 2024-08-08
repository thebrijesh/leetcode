class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = new int[][]{{0,1}, // right - E
                                        {1,0}, // down - S
                                        {0,-1}, // left - W
                                        {-1,0}};// up - N
        
        int[][] result = new int[rows * cols][2];
        int steps = 0;
        int dir = 0;
        int idx = 1;
        result[0] = new int[]{rStart,cStart};
        while(idx < result.length){
            if(dir == 0 || dir == 2){
                steps++;
            }
            for(int count = 0; count < steps; count++){
                rStart += directions[dir][0];
                cStart += directions[dir][1];

                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    result[idx++] = new int[]{rStart,cStart};
                }

            }
            dir = (dir +1) % 4;
        }
        return result;
    }
}