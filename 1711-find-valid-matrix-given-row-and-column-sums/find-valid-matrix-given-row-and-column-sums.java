class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        PriorityQueue<int[]> row = new PriorityQueue<>((o1, o2) -> (o2[0] - o1[0]));
        PriorityQueue<int[]> col = new PriorityQueue<>((o1, o2) -> (o2[0] - o1[0]));

        for (int i = 0; i < rowSum.length; i++) {
            row.add(new int[] { rowSum[i], i });
        }
        for (int i = 0; i < colSum.length; i++) {
            col.add(new int[] { colSum[i], i });
        }
        int[][] arr = new int[rowSum.length][colSum.length];

        while (!row.isEmpty() && !col.isEmpty()) {
            int[] rw = row.remove();
            int[] cl = col.remove();
            int min = Math.min(rw[0], cl[0]);
            arr[rw[1]][cl[1]] = min;
            rw[0] -= min;
            cl[0] -= min;

            if (rw[0] > 0) {
                row.add(rw);
            }

            if (cl[0] > 0) {
                col.add(cl);
            }

        }

        return arr;
    }
}