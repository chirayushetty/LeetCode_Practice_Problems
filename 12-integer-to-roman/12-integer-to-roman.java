class Solution {
    public String intToRoman(int num) {
        int[] numint = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numstr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<numint.length;i++){
            while(num >= numint[i]){
                sb.append(numstr[i]);
                num -= numint[i];
            }
        }
        
        return sb.toString();
    }
}