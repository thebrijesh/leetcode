class Solution {
public static List<Integer> sequentialDigits(int low, int high) {

        int num = 0, cnt = 1, add = 0;
        int low1 = low;
        while (low1 != 0) {
            low1 /= 10;
            num = (num * 10) + cnt;
            cnt++;
            add = add * 10 + 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int idx = num;
        while (num <= high) {
            if (num >= low) list.add(num);
            num += add;
            if (num % 10 == 0) return list;
            if (num % 10 == 9) {
                if (num >= low && num <= high) list.add(num);
                num = (idx * 10) + cnt;
                cnt++;
                idx = num;
                add = add * 10 + 1;
            }

        }
        return list;
    }
}