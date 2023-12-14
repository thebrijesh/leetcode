class Solution {
public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int count = 0;

        int index = 0;
        int i = 0;
        while (list.size() > 1) {
            

            index=(index+k-1)%(list.size());
            list.remove(index);
        }


        return list.get(0);
    }
}