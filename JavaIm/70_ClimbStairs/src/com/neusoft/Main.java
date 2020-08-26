package com.neusoft;
/*
* 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
注意：给定 n 是一个正整数。
* */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static int climbStairs2(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }
}
