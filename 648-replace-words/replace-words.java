class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] words = sentence.split(" ");

        for(int i = 0;i<words.length;i++){
            for(String root: dict){
                if(words[i].startsWith(root)){
                    words[i] = root;
                }
            }
        }
        System.out.print(Arrays.toString(words));
        String result = "";

        for(int i = 0;i<words.length;i++){
            result = result + words[i];
            if(i != words.length-1){
                result += " ";
            }
        }

        return result;
    }
}