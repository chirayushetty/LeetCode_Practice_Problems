class Solution {
    public String breakPalindrome(String palindrome) {
        // How to detect if there is impossible to perform the replacement? Only when the length = 1.
        if(palindrome.length() == 1){
            return "";
        }
        
        //Change the first non 'a' character to 'a'.
        char[] pal = palindrome.toCharArray();
        int len = palindrome.length();
        
        for(int i=0;i<len/2;i++){
            if(pal[i] != 'a'){
                pal[i] = 'a';
                return String.valueOf(pal);
            }
        }
        
        //if we reach here, there are ONLY 'a' in palindrome string, so we should change the last character to a b
        pal[len-1] = 'b';
        return String.valueOf(pal);
    }
}