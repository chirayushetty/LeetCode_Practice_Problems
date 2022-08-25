// Lagrange's four-square theorem / Bachet's conjecture / Legendre's theorem

class Solution {
    public int numSquares(int n) {
        // To check if n is a perfect square:
        if(isSqrt(n)) return 1;
        
        // To check if n is of the form 4**a(8b+7) [Legendre's theorem] : 
        while(n%4==0) n/=4;  //Remove 4^a term
        
        if(n%8==7) return 4;    //check if the no now is in the form of (8b + 7)
        
        for(int i=1; i<=Math.sqrt(n); i++){
            if(isSqrt(n-(i*i))) return 2;
        }
        return 3;
    }
    
    private boolean isSqrt(int n){
        int sqrt = (int)Math.sqrt(n);
        
        return n-(sqrt*sqrt)==0;
    }
}