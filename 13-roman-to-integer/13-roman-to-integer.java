// https://youtu.be/y3wLsoK0V6E

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        //       I V
        //      +1 -1 +5 -1 = 4
        // 1) +1 is for I.
        // 2) -1 is because there is I before V so as per rule we should -1.
        // 3) +5 is for V.
        // 4) but for correct ans i.e 4 should do another -1.
        // 5) In total we have to do -2 for getting the correct ans.
        
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='V' || s.charAt(i)=='X'){
                if(i>0 && s.charAt(i-1)=='I'){
                    sum -= 2;
                }
            }
            
            if(s.charAt(i)=='L' || s.charAt(i)=='C'){
                if(i>0 && s.charAt(i-1)=='X'){
                    sum -= 20;
                }
            }
            
            if(s.charAt(i)=='D' || s.charAt(i)=='M'){
                if(i>0 && s.charAt(i-1)=='C'){
                    sum -= 200;
                }
            }
            
            sum += map.get(s.charAt(i));
        }
        
        return sum;
    }
}