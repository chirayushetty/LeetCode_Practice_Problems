class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Brute force:
        // TC: O(n * m), SC: O(n)
//         int[] idx = new int[nums1.length];
        
//         for(int i=0;i<nums1.length;i++){
//             for(int j=0;j<nums2.length;j++){
//                 if(nums1[i]==nums2[j]){
//                     idx[i]=j;
//                 }
//             }
//         }
        
//         int[] ans = new int[nums1.length];
        
//         for(int i=0;i<nums1.length;i++){
//             for(int j=idx[i]+1;j<nums2.length;j++){
//                 if(nums2[j]>nums2[idx[i]]){
//                     ans[i] = nums2[j];
//                     break;
//                 }
//             }
//              if (ans[i] == 0) ans[i] = -1;
//         }
        
//         return ans;
        
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm= new HashMap<>();
        int n = nums2.length;
        
        for(int i=n-1;i>=0;i--){
            while(st.isEmpty()==false && st.peek()<=nums2[i]){
                st.pop();
            }
            
            if(i<n){
                if(st.isEmpty()==false){
                    hm.put(nums2[i],st.peek());
                }else{
                    hm.put(nums2[i],-1);
                }
            }
            
            st.push(nums2[i]);
        }
        
         int[] nge = new int[nums1.length];
        
        for(int j=0;j<nums1.length;j++){
            if(hm.containsKey(nums1[j])){
                nge[j]=hm.get(nums1[j]);
            }
        }
        return nge;
        
    }
}