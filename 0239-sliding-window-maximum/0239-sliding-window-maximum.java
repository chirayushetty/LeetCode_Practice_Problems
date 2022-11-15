// https://youtu.be/CZQGRp93K4k
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
// Brute force : TLE
// TC: O((n - k) * k)) => O(n * k)
// SC: O(n)
//         int n = nums.length;
//         int[] ans = new int[n-k+1];
//         for(int i=0;i<=n-k;i++){
//             int max = nums[i];
//             for(int j=i;j<=i+k-1;j++){
//                 max = Math.max(max,nums[j]);
//             }
//             ans[i] = max;
//         }
        
//         return ans;
        
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int ansi = 0;
        Deque<Integer> q = new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            //remove numbers that are out of range k.
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            //remove smaller numbers in range k as they are useless.
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            
            q.offer(i);
            if(i>=k-1){
                ans[ansi++] = nums[q.peek()];
            }
        }
        
        return ans;
    }
}