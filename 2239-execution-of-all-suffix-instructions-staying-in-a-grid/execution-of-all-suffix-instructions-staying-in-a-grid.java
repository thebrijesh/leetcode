class Solution {
    public static int[] executeInstructions(int n, int[] nums, String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int raw = nums[0];
            int cal = nums[1];
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(j) == 'R'){
                    cal++;

                } else if(s.charAt(j) == 'D'){
                    raw++;
                }else if(s.charAt(j) == 'L'){
                    cal--;
                }else if(s.charAt(j) == 'U'){
                    raw--;
                }
                if(raw >= 0 && cal >= 0 && raw < n && cal < n){
                    count++;

                }else {
                   break;
                }
            }
            arr[i] = count;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    return arr;
    }
}