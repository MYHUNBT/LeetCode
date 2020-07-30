package com.neusoft;


import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/7/1 12:45
 * 存在数字范围问题，范围过大就会报错
 */

public class Solution {
    public int reverse(int x) {
        boolean flag = false;
        String num = String.valueOf(x);
        num = num.replaceAll("0+?$", "");//去掉后面无用的零
        char[] chars = num.toCharArray();
        if (chars[0] == '-') flag = true;
        for (int i = flag? 1:0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i-(flag? 0:1)];
            chars[chars.length - i-(flag? 0:1)] = temp;
        }
        String s = String.valueOf(chars);
        int i = Integer.parseInt(s);
        return i;
    }
}
