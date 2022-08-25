class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] alphacounter = new int[26];
        
        for(char c : magazine.toCharArray()){
            alphacounter[c - 'a']++;
        }
        
        for(char c : ransomNote.toCharArray()){
            if(alphacounter[c - 'a']==0) return false;
            alphacounter[c - 'a']--;
        }
        
        return true;
    }
}

// ransomNote length is larger than that of magazine, just return false