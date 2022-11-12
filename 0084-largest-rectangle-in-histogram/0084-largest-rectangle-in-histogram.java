class Solution {
    public int largestRectangleArea(int[] heights) {
      Stack<Integer> st = new Stack<>();
      int maxA = 0;
      int n = heights.length;
      for (int i = 0; i <= n; i++) {
        while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])) {
          int height = heights[st.peek()];
          st.pop();
          int width;
          if (st.empty())
            width = i;
          else
            width = i - st.peek() - 1;
          maxA = Math.max(maxA, width * height);
        }
        st.push(i);
      }
      return maxA;
    }
}

// Brute force : TLE
//         int res = 0;
//         for(int i=0;i<heights.length;i++){
//             int currarea = heights[i];
            
//             for(int j=i-1;j>=0;j--){
//                 if(heights[j]>=heights[i])  currarea += heights[i];
//                 else    break;
//             }
            
//             for(int j=i+1;j<heights.length;j++){
//                 if(heights[j]>=heights[i])  currarea += heights[i];
//                 else    break;
//             }
            
//             res = Math.max(res,currarea);
//         }
        
//         return res;