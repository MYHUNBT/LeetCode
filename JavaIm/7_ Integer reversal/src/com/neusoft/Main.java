package com.neusoft;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int nums = -120;
	    boolean flag = false;
	    String num = String.valueOf(nums);
       if(nums != 0){
           num = num.replaceAll("0+?$", "");//去掉后面无用的零
       }
        char[] chars = num.toCharArray();
        if (chars[0] == '-') flag = true;
        System.out.println(flag);
        for (int i = flag? 1:0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i-(flag? 0:1)];
            chars[chars.length - i-(flag? 0:1)] = temp;
        }
        String s = String.valueOf(chars);
        Integer i = Integer.parseInt(s);
        System.out.println(i);
    }
}
