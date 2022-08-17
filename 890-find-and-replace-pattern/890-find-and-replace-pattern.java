// Apple and Microsoft
// similar to leetcode 205
// https://youtu.be/2jgt3L7spyA

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
       List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) res.add(word);
        }
        return res;
    }
    
    boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
}

// https://youtu.be/2jgt3L7spyA

//     {
//     List<String> ans = new ArrayList<>();
        
//         for(String w : words){
//             if(isIsomorphic(w,pattern)){
//                 ans.add(w);
//             }
//         }
        
//         return ans;
//     }
    
//     public boolean isIsomorphic(String w, String p){
//         Map<Character, Character> wmap = new HashMap<>();
//         Map<Character, Character> pmap = new HashMap<>();
        
//         for(int i=0;i<w.length();i++){
//             char a = w.charAt(i);
//             char b = p.charAt(i);
            
//             if((wmap.containsKey(a) && wmap.get(a) != b) || (pmap.containsKey(b) &&                         pmap.get(b) != a)){
//                 return false;
//             }
//             wmap.put(a,b);
//             pmap.put(b,a);
//         }
        
//         return true;
//     }

