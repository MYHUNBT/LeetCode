package com.neusoft.Four_CanPermutePalindrome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author liuboting
 * @date 2020/8/22 15:00
 */

public class Four_CanPermutePalindrome {
    public static void main(String[] args) {
        String s = "tactcoa";
        System.out.println(canPermutePalindrome(s));
    }
    public static boolean canPermutePalindrome(String s) {

        char[] chars = s.toCharArray();
        int[] arr = new int[123];
        for (int i = 0; i < chars.length; i++) {
            arr[chars[i]]++;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 1){
                count++;
            }
        }
        return count>1? false:true;
    }

    public static boolean canPermutePalindrome2(String s){
                HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int count = 0;
        for (Integer value:map.values()) {
            if(value%2 == 1){
                count++;
            }
        }
        return count>1? false:true;
    }
}
