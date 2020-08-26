package com.neusoft.Three_ReplaceSpaces;

import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/8/20 20:05
 * RL化。编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 */

public class Solution {
    public static void main(String[] args) {
        String str = "               ";
        System.out.println(replaceSpaces(str,5));
    }
    public static String replaceSpaces(String S,int length){

//        StringBuffer stringBuffer = new StringBuffer(S);
//        stringBuffer.delete(length,stringBuffer.length());
//        return stringBuffer.toString().replace(" ","%20");
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            if(String.valueOf(S.charAt(i)).equals(" ")){
                strings[i] = "%20";
            }else {
                strings[i] = String.valueOf(S.charAt(i));
            }
        }
//        StringBuffer stringBuffer = new StringBuffer("");
//        for (String s:strings) {
//            stringBuffer.append(s);
//        }
        return strings.toString();
    }
}
