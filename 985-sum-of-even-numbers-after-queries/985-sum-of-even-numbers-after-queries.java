class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[nums.length];
        
        int evenSum = 0;
        for(int num : nums){
            if(num%2==0){
                evenSum += num;   
            }
        }
        
        for(int i=0;i<queries.length;i++){
            int index = queries[i][1];
            int val = queries[i][0];
            
            if(nums[index]%2==0){
                evenSum -= nums[index];
            }
            
            nums[index] += val;
            
            if(nums[index]%2==0){
                evenSum += nums[index];
            }
            
            ans[i] = evenSum;
        }
        
        return ans;
    }
}


//  Brute force TLE:
//     int[] ans = new int[nums.length];
        
//         for(int i=0;i<nums.length;i++){
//             int index = queries[i][1];
//             int val = queries[i][0];
            
//             nums[index] += val;
//             ans[i] = evenSum(nums);
//         }
        
//         return ans;
        
//     }
    
//     static int evenSum(int[] nums){
//         int sum = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]%2==0){
//                 sum+=nums[i];
//             }
//         }
//         return sum;