class Solution {
    public static int gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b,a % b);


    }
public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < deck.length; i++) {

            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);


        }
       int  ans  = 0;

         for (var val : map.values()) {
           ans = gcd(ans,val);

        }

        if(ans >= 2){
            return true;
        }else{
            return false;
        }
        
    }
}