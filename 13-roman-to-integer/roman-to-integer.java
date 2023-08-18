class Solution {
    public static int romanToInt(String s) {
        int val =0; int val1 =0; int ans =0;
        int I =1, V =5, X =10, L=50, C= 100, D=500, M = 1000 ;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> val = 1;
                case 'V' -> val = 5;
                case 'X' -> val = 10;
                case 'L' -> val = 50;
                case 'C' -> val = 100;
                case 'D' -> val = 500;
                case 'M' -> val = 1000;
            }
            if (i < s.length()-1){
                switch (s.charAt(i+1)) {
                    case 'I' -> val1 = 1;
                    case 'V' -> val1 = 5;
                    case 'X' -> val1 = 10;
                    case 'L' -> val1 = 50;
                    case 'C' -> val1 = 100;
                    case 'D' -> val1 = 500;
                    case 'M' -> val1 = 1000;
                }
            }
            
            if (val < val1){
              ans -= val;
            }else {
               ans += val;
            }

            
        }
        return ans;
    }
}