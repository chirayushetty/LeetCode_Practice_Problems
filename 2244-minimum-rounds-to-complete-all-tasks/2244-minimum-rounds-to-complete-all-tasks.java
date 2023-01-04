class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int ans = 0,count = 0;
        
        for(int i=0;i<tasks.length;i++){
            count++;
            
            if(i==tasks.length-1 || tasks[i] != tasks[i+1]){
                if(count == 1){
                    return -1;
                }
                ans += count / 3;
                // If there are remaining tasks that cannot be included in a group of 3,
                // we need one more round to process these tasks
                if(count % 3 != 0) ans++;
                // Reset the count for the next set of tasks
                count = 0;
            }
        }
        return ans;
    }
}