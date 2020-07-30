package com.neusoft;

/**
 * @author liuboting
 * @date 2020/7/2 10:56
 */

class BetterSolution {
    public boolean isPalindrome(int x) {
        int x1 = x;
        int num = 0;
        if(x == 0) return true;
        if(x < 0 || x%10 == 0) return false;
        while(x1 != 0){
            num = num*10 + x1%10;
            x1 = x1/10;
        }
        return num == x;
    }
}
