class Solution {
    private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
 
    private final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        
        return helper(num).trim();
    }

    public String helper(int num){



        StringBuilder str = new StringBuilder();
        if(num >= 1000000000){
            str.append(helper(num/1000000000)).append(" Billion ").append(helper(num % 1000000000));
        }else if(num >= 1000000){
            str.append(helper(num/1000000)).append(" Million ").append(helper(num % 1000000));
        }else if(num >= 1000){
            str.append(helper(num/1000)).append(" Thousand ").append(helper(num % 1000));
        }else if(num >= 100){
            str.append(helper(num/100)).append(" Hundred ").append(helper(num % 100));
        }else if(num >= 20){
            str.append(belowHundred[num/10]).append(" ").append(helper(num % 10));
        }else{
            str.append(belowTen[num]);
        }

        return str.toString().trim();
    }
}