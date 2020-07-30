package com.neusoft;

/**
 * @author liuboting
 * @date 2020/7/1 16:22
 */

public class BetterSolution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int) res : 0;
    }
}
