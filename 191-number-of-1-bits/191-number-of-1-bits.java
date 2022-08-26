// https://youtu.be/wLHhAHkID9M
// Time: O(m), where m is the number of set bits
// Space: O(1), in-place

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int count = 0;
       while(n!=0){
            n &= n-1;
            count++;
       }
        return count;
    }
}

        // int count = 0;
        // while(n>0){
        //     if((n&1)==1){
        //         count++;
        //     }
        //     n >>= 1;
        // }
        // return count;