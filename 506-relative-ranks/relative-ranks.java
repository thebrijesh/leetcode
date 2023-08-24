class Solution {
    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] str = new String[score.length];
        int[] arr = new int[1000000];
        for (var num : score) {
            arr[num] = 1;

        }
        int counter = 0;
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0 && counter < 3) {
                if (counter == 0) {
                    map.put(i, "Gold Medal");
                    counter++;
                } else if (counter == 1) {
                    map.put(i, "Silver Medal");
                    counter++;
                } else if (counter == 2) {
                    map.put(i, "Bronze Medal");
                    counter++;
                }
            } else {

                if (arr[i] > 0) {
                    counter++;
                    map.put(i, String.valueOf(counter));
                }
            }

        }
        for (var num : score) {

            str[j] = map.get(num);
           
            j++;
        }
        return str;
    }
}