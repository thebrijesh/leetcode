// class Solution {
//     long count = 0;
//     public int knightDialer(int n) {
//         List<List<Integer>>list = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//             list.add(new ArrayList<>());
//         }
//         list.get(0).add(6);
//         list.get(0).add(4);

//         list.get(1).add(6);
//         list.get(1).add(8);

//         list.get(2).add(9);
//         list.get(2).add(7);

//         list.get(3).add(4);
//         list.get(3).add(8);

//         list.get(4).add(9);
//         list.get(4).add(3);
//         list.get(4).add(0);

//         list.get(6).add(0);
//         list.get(6).add(1);
//         list.get(6).add(7);

//         list.get(7).add(2);
//         list.get(7).add(6);

//         list.get(8).add(3);
//         list.get(8).add(1);

//         list.get(9).add(2);
//         list.get(9).add(4);
//         count = 0;
        
//         for (int i = 0; i <= 9; i++) {
//             solve(list,i, n-1);
//         }
//         return (int) (count % 1000000007);
//     }
//     public void solve(List<List<Integer>>list, int i, int n){
//         if(n == 0) {
//             count++;
//             return;
//         }
//         for (int j = 0; j < list.get(i).size(); j++) {
//             int x = list.get(i).get(j);
//             solve(list,x,n-1);
//         }
//     }
// }
class Solution {
    static final int mod = (int) 1e9 + 7;
    static final int[][] MOVES = {
            /*0*/ {4, 6},
            /*1*/ {6, 8},
            /*2*/ {7, 9},
            /*3*/ {4, 8},
            /*4*/ {0, 3, 9},
            /*5*/ {},
            /*6*/ {0, 1, 7},
            /*7*/ {2, 6},
            /*8*/ {1, 3},
            /*9*/ {2, 4}
    };
    static final int[][] cache = new int[5001][10];
     
    public int knightDialer(int n) {
        return knightDialer(n, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    int knightDialer(int remaining, int[] nextNumbers) {
        if (remaining == 1) return nextNumbers.length;
        int count = 0;

        for (int nextNumber : nextNumbers) {
            int cur = cache[remaining][nextNumber];
            if (cur == 0) {
                cur = knightDialer(remaining - 1, MOVES[nextNumber]);
                cache[remaining][nextNumber] = cur;
            }
            count += cur;
            count %= mod;
        }
        return count;
    }
} 