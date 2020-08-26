package com.neusoft;

import java.util.HashMap;

/**
 * @author liuboting
 * @date 2020/8/14 14:02
 */

public class Test {
    public static void main(String[] args) {
        String s = "21";
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        String str = "";
        for (int j = 1; j < s.length(); j++) {
            if(j == s.length()-1){
                if(s.charAt(j) == s.charAt(j-1)){
                    map.put(s.charAt(j),++count);
                    str += map.get(s.charAt(j - 1)) + String.valueOf(s.charAt(j-1));
                }else {
                    if(!map.containsKey(s.charAt(j-1))){
                        str += "1" + String.valueOf(s.charAt(j-1));
                    }else {
                        str += map.get(s.charAt(j - 1)) + String.valueOf(s.charAt(j-1));
                    }
                    str += "1" + String.valueOf(s.charAt(j));
                }
            } else if (s.charAt(j) == s.charAt(j - 1)) {
                map.put(s.charAt(j - 1), ++count);
            } else {
                count = 1;
                str = str + map.get(s.charAt(j - 1)) + String.valueOf(s.charAt(j-1));
            }

        }
        System.out.println(str);


    }

}
