class Solution {
    public String removeOuterParentheses(String s) {
// O(N) Time, O(N) space
//         StringBuilder sb = new StringBuilder();
        
//         int count= 0;
//         for(char c : s.toCharArray()){
//             if(c=='('){
//                 if(count != 0) sb.append(c);
//                 count++;
//             }else{
//                 count--;
//                 if(count != 0)  sb.append(c);
//             }
//         }
        
//         return sb.toString();
        
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
           if(c=='('){
               if(st.size()>=1){
                   sb.append(c);
               }
               st.push(c);
           }else{
               if(st.size()>1){
                   sb.append(c);
               }
               st.pop();
           }
        }
        return sb.toString();
    }
}