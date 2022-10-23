// https://youtu.be/JfinxytTYFQ
// Similar to cycle sort HINT : range [1, n].
// M-2 : Can also be done using BIT MANIPULATION.

class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] !=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
    
    void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}