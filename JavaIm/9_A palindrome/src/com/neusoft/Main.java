package com.neusoft;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int x = -121;
        String nums = String.valueOf(x);
        char[] chars = nums.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i -1];
            chars[chars.length - i-1] = temp;
        }
        nums = String.valueOf(chars);
        try{
            int a = Integer.parseInt(nums);
            if(a == x){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }catch (Exception exception){
            System.out.println(false);
        }


    }
}
