package com.neusoft;
/*
    实现 strStr() 函数。
    给定一个 haystack 字符串和一个 needle 字符串，
    在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
    如果不存在，则返回  -1。
*/

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String haystack = "mississippk";
        String needle = "ksda";
//        System.out.println(strStr(haystack, needle));
//        System.out.println(haystack.indexOf(needle));
        System.out.println(strStr3(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.equals("") || haystack.equals(needle)) return 0;
        String[] split = haystack.split(needle);
        if(split.length == 0) return 0;
        char[] chars = haystack.toCharArray();
        if(split[0].equals(haystack)){
            return -1;
        }else {
            if(split[0].equals("")) return 0;
            return split[0].length();
        }
    }
    public static int strStr2(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static int strStr3(String haystack, String needle){
        if(needle.equals("")) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.length() < i+needle.length()) return -1;
            if(haystack.charAt(i) == needle.charAt(0) && haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
