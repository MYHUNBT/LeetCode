package com.neusoft;

import java.util.HashMap;

/**
 * @author liuboting
 * @date 2020/8/23 18:25
 */

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

        String s = "wkwe";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i]) == null){
                map.put(chars[i],1);
            }else {
                if(map.keySet().size()>maxLength){
                    maxLength = map.keySet().size();
                }
                map.clear();
                i = index++;
            }
            if(i == chars.length-1){
                if(map.keySet().size()>maxLength){
                    maxLength = map.keySet().size();
                }
            }
        }
        return maxLength;
    }
}
