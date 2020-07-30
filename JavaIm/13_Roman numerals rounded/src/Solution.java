import java.util.HashMap;

/**
 * @author liuboting
 * @date 2020/7/3 17:42
 */

public class Solution {
    public int romanToInt(String s) {
        Integer sum = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i = 0; i < s.length()-1; i++) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum-=map.get(s.charAt(i));
            }else{
                sum+=map.get(s.charAt(i));
            }
        }
        sum+=map.get(s.charAt(s.length()-1));
        return sum;
    }
}
