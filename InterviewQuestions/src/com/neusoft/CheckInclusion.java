package com.neusoft;

import java.util.*;

/**
 * @author liuboting
 * @date 2020/8/24 15:26
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
 */

public class CheckInclusion {
    public static void main(String[] args) {
        String s1 = "hello" ;
        String s2 = "ooolleoooleh";
//        StringBuffer stringBuffer = new StringBuffer("aab");
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length() || s2.length() == 0){
            return false;
        }
        String[] split = s1.split("");
//        for (int i = 0; i < split.length; i++) {
//            if(!s2.contains(split[i])){
//                return false;
//            }
//        }
        String s = split[0];
        StringBuffer subStr;
        int index = 0;
        while (true){
            index = s2.indexOf(s,index);
            if(index == -1){
                return false;
            }
            A: for (int i = 0; i < split.length; i++) {
                try{
                    subStr = new StringBuffer(s2.substring(index-split.length+1+i,index+i+1));
                    for (int j = 0; j < split.length; j++) {
                        int index1 = subStr.indexOf(split[j]);
                        if(index1 != -1){
                            subStr.deleteCharAt(index1);
                        }else {
                            continue A;
                        }
                    }
                    return true;
                }catch (StringIndexOutOfBoundsException e){
                    continue A;
                }
            }
            index++;
        }
    }
}
