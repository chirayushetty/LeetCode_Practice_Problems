// Time complexity: O(n⋅logn)
// Space complexity: O(logn)
// JPMC interview:

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans =new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min = Math.min(min,arr[i+1]-arr[i]);
        }
        
        for(int i=0;i<arr.length-1;i++){
            List<Integer> list = new ArrayList<>();
            if(arr[i+1]-arr[i]==min){
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(list);
            }
        }
        
        return ans;
    }
}


        // Arrays.sort(arr);
        // List<Integer> list = new ArrayList<>();
        // List<Integer> ans = new ArrayList<>();
        // int min = arr[arr.length-1];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]-arr[i]<min){
        //             list.add(arr[i],arr[j]);
        //         }
        //     }
        // }
        // ans.add(list);
        // return ans;