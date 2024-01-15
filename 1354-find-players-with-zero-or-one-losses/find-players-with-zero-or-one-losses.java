class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        int[] arr = new int[100001];
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list);
        for (var num: matches) {
            arr[num[1]]++;
            set.add(num[1]);
            set.add(num[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 && set.contains(i)){
                list1.add(i);
            } else if (arr[i] == 1 && set.contains(i)) {
                list2.add(i);
            }
        }
        list.add(list1);
        list.add(list2);
       return list;
    }

}