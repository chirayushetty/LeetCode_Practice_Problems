class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] idx = new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx[i]=j;
                }
            }
        }
        
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=idx[i]+1;j<nums2.length;j++){
                if(nums2[j]>nums2[idx[i]]){
                    ans[i] = nums2[j];
                    break;
                }
            }
             if (ans[i] == 0) ans[i] = -1;
        }
        
        return ans;
    }
}