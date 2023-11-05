class Solution {
    public String removeDigit(String number, char digit) {
        String max = "";
       for(int i = 0; i < number.length(); i++){
           if(number.charAt(i) == digit){
               String new1 = number.substring(0,i) + number.substring(i+1);
               if(new1.compareTo(max) > 0){
                   max = new1;
               }
           }
       }
       return max;
    }
}

//class Solution {
//    public String removeDigit(String number, char digit) {
//        int index = 0,n=number.length();
//        for(int i=0;i<n;i++){
//            if(number.charAt(i)==digit){
//                index = i;
//              if(i<n-1 && digit < number.charAt(i+1)) break;
//          }
//        }
//      number = number.substring(0, index) + number.substring(index+1);
//      return number;
//  }
//}