class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> char_st = new Stack<>();
        Stack<Integer> count_st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(char_st.size()>0 && char_st.peek()==c){
                count_st.push(count_st.peek()+1);
            }else{
                count_st.push(1);
            }
            
            char_st.push(c);
            
            if(count_st.peek()==k){
                for(int i=0;i<k;i++){
                    char_st.pop();
                    count_st.pop();
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!char_st.isEmpty()){
            sb.append(char_st.pop());
        }
        
        return sb.reverse().toString();
    }
}