class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        
        int N = citations.length;
        for(int h=N;h>0;h--){
            if(citations[N-h]>=h){
                return h;
            }
        }
        
        return 0;
    }
}