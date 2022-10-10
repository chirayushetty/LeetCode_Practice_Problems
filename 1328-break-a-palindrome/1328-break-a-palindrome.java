class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1){
            return "";
        }
        
        char[] pal = palindrome.toCharArray();
        int len = palindrome.length();
        
        for(int i=0;i<len/2;i++){
            if(pal[i] != 'a'){
                pal[i] = 'a';
                return String.valueOf(pal);
            }
        }
        
        pal[len-1] = 'b';
        
        return String.valueOf(pal);
    }
}