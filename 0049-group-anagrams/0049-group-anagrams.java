class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//         if(strs==null || strs.length==0)  return new ArrayList<>();
        
//         Map<String,List<String>> map = new HashMap<>();
        
//         for(String s : strs){
//             char[] ca = s.toCharArray();
//             Arrays.sort(ca);
//             String keyStr = String.valueOf(ca);
//             if(!map.containsKey(keyStr))   map.put(keyStr,new ArrayList<>());
//             map.get(keyStr).add(s);
//         }
//         return new ArrayList<>(map.values());
        
        //       Initialization of Hashmap Key is type of String and Value is type of List<String
        HashMap<String, List<String> > map = new HashMap<>(); 
        
        
        for(String s : strs){ // Taking one by one String from strs array
            char[] chars = s.toCharArray(); //Converting String to Char Array
            Arrays.sort(chars); // Sorting The Char Array by using inbuilt Sorting Method
            String key = String.valueOf(chars); //Converting Sorted Char array to String. It will act as a Key for our hashmap
            if(map.containsKey(key)){
                map.get(key).add(s); //If key exist then add the String or append the string to the end of the list
            }else{
                map.put(key, new ArrayList<>()); // If key not present then initialize the ArrayList 
                map.get(key).add(s); // and add the Perticular String to that key.
            } 
        }
        
        return new ArrayList<>(map.values());
    }
}