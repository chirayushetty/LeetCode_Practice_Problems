class Solution {
    public String removeDuplicates(String s) {
// TC: O(N + N) = O(N) -> N for Iterating over the string. N for
// SC: O(N) -> Space used by the StringBuilder
//         StringBuilder sb = new StringBuilder();
    
//         for(char c : s.toCharArray()){
//             int size = sb.length();
//             if(size>0 && sb.charAt(size-1)==c){
//                 sb.deleteCharAt(size-1);
//             }else{
//                 sb.append(c);
//             }
//         }
        
//         return sb.toString();
        
// Using stacks:
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}