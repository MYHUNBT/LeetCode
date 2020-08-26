package com.neusoft.Five_oneEditAway;

/**
 * @author liuboting
 * @date 2020/8/22 16:54
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
 * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 */

public class Five_OneEditAway {
    public static void main(String[] args) {
        String first = "pale";
        String second = "ple";
//        System.out.println(first.equals(second));
        System.out.println(oneEditAway2(first, second));
    }
    public static boolean oneEditAway(String first, String second) {
        int abs = Math.abs(first.length() - second.length());
        if(abs > 1){
            return false;
        }else if(abs == 1){
            StringBuffer s1 = new StringBuffer(first.length() > second.length() ? first : second);
            StringBuffer s2 = new StringBuffer(first.length() < second.length() ? first : second);
            for (int i = 0; i < s1.length(); i++) {
                if(i == s1.length()-1){
                    s1.deleteCharAt(i);
                   return s1.toString().equals(s2.toString());
                }else if(s1.charAt(i) != s2.charAt(i)){
                    s1.deleteCharAt(i);
                    return s1.toString().equals(s2.toString());
                }
            }
        }else{
            int count = 0;
            for (int i = 0; i < first.length(); i++) {
                if(first.charAt(i) != second.charAt(i)){
                    if(++count > 1){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean oneEditAway2(String first, String second) {
        //判断长度差别是否满足一位以内
        int a=first.length()-second.length();
        if (a>1||a<-1){
            return false;
        }
        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();
        //只能跳过一次
        boolean hasContinue=false;
        for (int i = 0,j=0; i < chars1.length&&j<chars2.length; i++,j++) {
            if (chars1[i]==chars2[j]){
                continue;
            }else if(hasContinue){
                return false;
            }
            if (a==1){ //长的到下一位，短的原地踏步
                j--;
            }else if(a==-1){
                i--;
            }
            hasContinue=true;
        }
        return true;

    }
}
