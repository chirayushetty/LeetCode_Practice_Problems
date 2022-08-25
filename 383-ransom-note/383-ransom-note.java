class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : magazine.toCharArray()){
            map.put(c , map.getOrDefault(c,0)+1);
        }
        
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0) return false;
            
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
        }
        
        return true;
        
//         if(ransomNote.length() > magazine.length()) return false;
        
//         int[] alphacounter = new int[26];
        
//         for(char c : magazine.toCharArray()){
//             alphacounter[c - 'a']++;
//         }
        
//         for(char c : ransomNote.toCharArray()){
//             if(alphacounter[c - 'a']==0) return false;
//             alphacounter[c - 'a']--;
//         }
        
//         return true;
    }
}

