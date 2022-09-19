class Solution {
    public int[] sortArray(int[] nums) {
        int[] output = new int[nums.length];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        
        int[] count = new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]-min]++;
        }
        
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        
        for(int i=nums.length-1;i>=0;i--){
            output[count[nums[i]-min]-1] = nums[i];
            count[nums[i]-min]--;
        }
        
        return output;
    }
}