// https://youtu.be/Du881K7Jtk8
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] nge = new int[n];
        
        
        for(int i=2*n-1;i>=0;i--){
            while(st.isEmpty()==false && st.peek()<=nums[i%n]){
                st.pop();
            }
            
            if(i<n){
                if(st.isEmpty()==false){
                    nge[i]=st.peek();
                }else{
                    nge[i] = -1;
                }
            }
            
            st.push(nums[i%n]);
        }
        
        return nge;
    }
}