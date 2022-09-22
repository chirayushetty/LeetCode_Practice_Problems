class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        
        for(String word : words){
            sb.append(" ").append(myMethod(word));
        }
        
        return sb.toString().substring(1);
        
    }
    
    static String myMethod(String s){                 //Method to reverse :
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}