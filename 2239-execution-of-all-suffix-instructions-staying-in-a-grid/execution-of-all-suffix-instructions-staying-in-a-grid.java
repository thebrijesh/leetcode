class Solution {
    public static int[] executeInstructions(int n, int[] nums, String s) {
        char[] charr = s.toCharArray();
        int[] arr = new int[s.length()];
        for (int i = 0; i < charr.length; i++) {
            int raw = nums[0];
            int cal = nums[1];
            int count = 0;
            for (int j = i; j < charr.length; j++) {
                if(charr[j] == 'R'){
                    cal++;

                } else if(charr[j] == 'D'){
                    raw++;
                }else if(charr[j] == 'L'){
                    cal--;
                }else if(charr[j] == 'U'){
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
    return arr;
    }
}