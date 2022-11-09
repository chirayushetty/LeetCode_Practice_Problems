class Solution {
    public boolean isValid(String s) {
// Using string: 
        
        // if(s.length()%2==1){
        //     return false;
        // }
        // int check = 0;
        // while(s.length()>0){
        //     check = s.length();
        //     s=s.replace("()", "");
        //     s=s.replace("[]", "");
        //     s=s.replace("{}", "");
        //     if(check == s.length()){
        //         return false;
        //     }
        // }
        // return true;
        
// Using stack:
        
        Stack<Character> st = new Stack<>();
        for(char a : s.toCharArray()){
            if(a=='(' || a=='{' || a=='['){
                st.push(a);
            }else{
                if(st.isEmpty())  return false;
                
                char ch = st.pop();
                if((ch=='(' && a==')') || (ch=='{' && a=='}') || (ch=='[' && a==']')){
                    continue;
                }else {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
        
    }
}