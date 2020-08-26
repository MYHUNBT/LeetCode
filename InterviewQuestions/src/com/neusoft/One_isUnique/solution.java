package com.neusoft.One_isUnique;

/**
 * @author liuboting
 * @date 2020/8/20 13:31
 */

public class solution {
    public static void main(String[] args) {

    }
    public boolean isUnique(String str) {
        if(str.length() <= 1){
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if(c == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
