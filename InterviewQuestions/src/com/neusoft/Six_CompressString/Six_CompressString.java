package com.neusoft.Six_CompressString;

import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/8/22 19:36
 */

public class Six_CompressString {
    public static void main(String[] args) {
        String S = "aabcccccaaa";
        System.out.println(compressString2(S));
    }
    public static String compressString(String S) {
        if(S.length() <= 1){
            return S;
        }
        String str = "";
        for (int start = 0,end = 1; end < S.length(); end++) {
            if(end == S.length()-1){
                if(S.charAt(start) != S.charAt(end)){
                    str += String.valueOf(S.charAt(start)) + (end-start);
                    str += String.valueOf(S.charAt(end)) + 1;
                }else {
                    str += String.valueOf(S.charAt(start)) + (end-start+1);
                }
            } else if(S.charAt(start) == S.charAt(end)){
                continue;
            }else {
                str += String.valueOf(S.charAt(start)) + (end-start);
                start = end;
            }
        }

        return str.length() >= S.length()? S:str;
    }

    public static String compressString2(String S){
        byte[] bytes = S.getBytes();
        System.out.println(Arrays.toString(bytes));
        return null;
    }
}
