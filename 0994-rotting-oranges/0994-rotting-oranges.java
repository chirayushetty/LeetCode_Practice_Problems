class Solution {
    public int orangesRotting(int[][] grid) {
// https://youtu.be/pUAPcVlHLKA
// TC : O(n*n*4)
// SC : O(n*n)
        Queue<int[]> queue = new LinkedList<>();
        int row = grid.length;
        int col = grid[0].length;
        int count_fresh = 0;
        
        if(grid == null || grid.length == 0) return 0;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                
                if(grid[i][j] != 0){
                    count_fresh++;
                }
            }
        }
        
        if(count_fresh==0)  return 0;
        int count_min = 0,cnt = 0;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        
        while(!queue.isEmpty()){
            int size = queue.size();
            cnt += size;
            for(int i=0;i<size;i++){
                int[] point = queue.poll();
                for(int j=0;j<4;j++){
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];
                    
                    if(x<0 || y<0 || x>=row || y>=col || grid[x][y]==0|| grid[x][y]==2) continue;
                    
                    grid[x][y]=2;
                    queue.offer(new int[]{x,y});
                }
            }
            if(queue.size() != 0){
                count_min++;
            }
        }
        return count_fresh==cnt ? count_min : -1;
    }
}