// https://youtu.be/6AackEaa0Qs

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        
        while(start<=end){
            mid = start + (end-start) / 2;
            
            if(arr[mid]==x){
                break;
            }else if(arr[mid]<x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        int l = 0,r = 0;
        if(mid>=1){
            l = mid - 1;
            r = mid;
        }else{
            l = mid;
            r = mid + 1;
        }
        
        List<Integer> list = new ArrayList<>();
        
        while(l>=0 && r<arr.length && k>0){
            if(Math.abs(arr[l]-x) <= Math.abs(arr[r]-x)){
                list.add(arr[l]);
                l--;
            }else{
                list.add(arr[r]);
                r++;
            }
            k--;
        }
        
        while(k>0 && l>=0){
            list.add(arr[l]);
            l--;
            k--;
        }
        
        while(k>0 && r<arr.length){
            list.add(arr[r]);
            r++;
            k--;
        }
        
        Collections.sort(list);
        return list;
    }
}