// https://youtu.be/Du881K7Jtk8
// i%n is done for circular array.
// TC & SC : O(n)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
//         Stack<Integer> st = new Stack<>();
//         int n = nums.length;
//         int[] nge = new int[n];
        
        
//         for(int i=2*n-1;i>=0;i--){
//             while(st.isEmpty()==false && st.peek()<=nums[i%n]){
//                 st.pop();
//             }
            
//             if(i<n){
//                 if(st.isEmpty()==false){
//                     nge[i]=st.peek();
//                 }else{
//                     nge[i] = -1;
//                 }
//             }
            
//             st.push(nums[i%n]);
//         }
        
//         return nge;
        
// Brute Force
// O(n2)
        
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;

            for (int j = 0; j < n; j++) {
                if (nums[(i + j) % n] > nums[i]) {
                    ans[i] = nums[(i + j) % n];
                    break;
                }
            }
        }

        return ans;
    }
}