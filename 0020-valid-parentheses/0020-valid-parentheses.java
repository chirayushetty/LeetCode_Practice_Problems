class Solution {
    public boolean isValid(String s) {
//         while (s.indexOf("{}") !=-1 || s.indexOf("[]") !=-1 || s.indexOf("()") !=-1 ){
//         s=s.replace("()","");
//         s=s.replace("[]","");
//         s=s.replace("{}","");
        
//     }
//     return s.isEmpty();
        
        if(s.length()%2==1){
            return false;
        }
        int check = 0;
        while(s.length()>0){
            check = s.length();
            s=s.replace("()", "");
            s=s.replace("[]", "");
            s=s.replace("{}", "");
            if(check == s.length()){
                return false;
            }
        }
        return true;
    }
}