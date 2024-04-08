class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one  = 0;
        int zero = 0;

        for(int num : students){
            if(num == 1)one++;
            else zero++;
        }

        for(int num : sandwiches){
            if(num == 0){
                if(zero == 0){
                    return one;
                }else{
                    zero--;
                }
            }else{
                if(one == 0){
                    return zero;
                }else{
                    one--;
                }
            }
        }
        return 0;
    }
}