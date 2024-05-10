class Solution {
    class Pair implements Comparable<Pair> {
        int i;
        int j;
        double num;

        Pair(int i, int j, double num) {
            this.i = i;
            this.j = j;
            this.num = num;
        }

        @Override
        public int compareTo(Pair o1) {
            // if (o1.num > this.num) {
            //     return 0;
            // }else if (o1.num < this.num) return -1;
            // return 1;
            return Double.compare(this.num , o1.num);

        }
    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                q.add(new Pair(arr[i], arr[j], (double) arr[i] / arr[j]));
            }
        }
     
        for(int i = 0; i < k-1; i++){
            q.remove();
        }
        Pair p = q.remove();
        int[] ans = new int[2];
        ans[0] = p.i;
        ans[1] = p.j;
        return ans;
    }
}