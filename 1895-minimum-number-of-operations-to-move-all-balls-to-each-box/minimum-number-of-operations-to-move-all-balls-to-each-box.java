class Solution {
public static int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];

        int count = 0;
        int sum =0;
        int idx = 0;
        boolean flag = false;
        for (int i = 0; i < boxes.length(); i++) {
            arr[i] += sum;
            if(boxes.charAt(i) == '1'){
                count++;


            }
            sum += count;
            
        }
        sum = 0; count = 0;

        for (int i = boxes.length()-1; i >= 0; i--) {
            arr[i] += sum;
            if(boxes.charAt(i) == '1'){
                count++;


            }
            sum += count;

        }



        for (var num : arr) {
            System.out.println(num);
        }
        return arr;
    }
}