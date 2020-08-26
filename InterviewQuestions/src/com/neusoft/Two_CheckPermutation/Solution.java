package com.neusoft.Two_CheckPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/8/20 18:13
 */

public class Solution {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
//        ArrayList<String> list = new ArrayList<>();
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < s1.length(); i++) {
//            if(map1.get(s1.charAt(i)) == null){
//                map1.put(s1.charAt(i),1);
//            }else {
//                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
//            }
//            if(map2.get(s2.charAt(i)) == null){
//                map2.put(s2.charAt(i),1);
//            }else {
//                map2.put(s2.charAt(i),map1.get(s2.charAt(i))+1);
//            }
//        }
//        System.out.println(map1.equals(map2));
        System.out.println(checkPermutation2(s1,s2));
    }
    public static boolean checkPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if(map1.get(s1.charAt(i)) == null){
                map1.put(s1.charAt(i),1);
            }else {
                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
            }
            if(map2.get(s2.charAt(i)) == null){
                map2.put(s2.charAt(i),1);
            }else {
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            }
        }
        return map1.equals(map2);
    }

    public static boolean checkPermutation2(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        String[] split = s1.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(split));
        for (int i = 0; i < s1.length(); i++) {
            String s = String.valueOf(s2.charAt(i));
            if(list.contains(s)){
                list.remove(s);
            }else {
                return false;
            }
        }
        return true;
    }
}


