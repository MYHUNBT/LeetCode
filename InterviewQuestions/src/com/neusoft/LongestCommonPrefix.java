package com.neusoft;

/**
 * @author liuboting
 * @date 2020/8/23 19:21
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        String[] strings2 = {"dog","racecar","car"};

//        String substring = strings[1].substring(0,4);
//        System.out.println(substring);
        System.out.println(longestCommonPrefix2(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int lessLength = strs[0].length();
        String s = strs[0];
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length() < lessLength){
                lessLength = strs[i].length();
                s = strs[i];
                index = i;
            }
        }
        boolean flag = false;
       A: while (lessLength > 0 && !flag){
            for (int i = 0; i < strs.length; i++) {
                if(i == index){
                    continue;
                }
                if(!strs[i].substring(0,lessLength).equals(s.substring(0,lessLength))){
                    if(--lessLength == 0){
                         return "";
                    }
                    continue A;
                }
            }
           flag = true;
       }
        return s.substring(0,lessLength);
    }

    public static String longestCommonPrefix2(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String s = "";
        int index = 0;
        boolean flag = true;
        A:while (flag){
            char c = strs[0].charAt(index);
            for (int i = 0; i < strs.length; i++) {
                if(strs[i].charAt(index) != c){
                    flag = false;
                    continue A;
                }
            }
            s += c;
        }
        return s;
    }
}
