class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        int mod = 1_000_000_007;
        
        for(int i=1;i<=n;i++){
            String binaryString = Integer.toBinaryString(i);
            res = (res << binaryString.length()) % mod;
            res = (res + i) % mod;
        }
        
        return (int) res;
    }
}


// Runtime error:

//         StringBuilder sb = new StringBuilder();
        
//         for(int i=1;i<=n;i++){
//             sb.append(Integer.toBinaryString(i));
//         }
        
//         int decimal=Integer.parseInt(sb.toString(),2);  
        
//         return decimal;