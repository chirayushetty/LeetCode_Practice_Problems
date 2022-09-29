// Google interview (most asked):
// Longest contiguous subarray of only 2 elements

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int end = 0,counter = 0,start = 0,len = 0;
        while(end<fruits.length){
            int a = fruits[end];
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(a)==1)   counter++;
            end++;
            
            while(counter > 2){
                int temp = fruits[start];
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0)    counter--;
                start++;
            }
            len = Math.max(len,end-start);
        }
        return len;
    }
}

// https://youtu.be/s_zu2dOkq80

//         int last_fruit = -1;
//         int second_last_fruit = -1;
//         int last_fruit_count = 0;
//         int max = 0;
//         int current_max = 0;
        
//         for(int fruit : fruits){
//             if(fruit==last_fruit || fruit==second_last_fruit){
//                 current_max += 1;
//             }else{
//                 current_max = last_fruit_count + 1;
//             }
            
//             if(fruit==last_fruit){
//                 last_fruit_count += 1;
//             }else{
//                 last_fruit_count = 1;
//             }
            
//             if(fruit!=last_fruit){
//                 second_last_fruit = last_fruit;
//                 last_fruit = fruit;
//             }
            
//             max = Math.max(current_max,max);
//         }
        
//         return max;