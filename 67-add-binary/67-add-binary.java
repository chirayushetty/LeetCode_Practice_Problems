// https://youtu.be/OEW50g03mT0

class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
       
       int i = a.length() - 1;
       int j = b.length() - 1;
       int carry = 0;
        
       while(i>=0 || j>=0){
           int sum = carry;
           if(i>=0) sum += a.charAt(i) - '0';
           if(j>=0) sum += b.charAt(j) - '0';
           sb.append(sum%2); // if sum==2 or sum==0 append 0 cause 1+1=0 in this case as                                  this is base 2 (just like 1+9 is 0 if adding ints in columns
           carry = sum / 2;  //if sum==2 we have a carry, else no carry 1/2 rounds down to 0                              in integer arithematic
           i--;
           j--;
       }
       if(carry!=0) sb.append(carry);
       return sb.reverse().toString();
       
    }
}