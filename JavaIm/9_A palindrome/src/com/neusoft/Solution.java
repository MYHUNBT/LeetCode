package com.neusoft;

/**
 * @author liuboting
 * @date 2020/7/2 10:54
 */

public class Solution {
    public boolean isPalindrome(int x) {
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
                return true;
            }else {
                return false;
            }
        }catch (Exception exception){
            return false;
        }
    }
}