package com.neusoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int a = Integer.parseInt(split[2]);
        int b = Integer.parseInt(split[3]);
        System.out.println(showNum(A, B, a, b));
    }
    public static String showNum(int A,int B,int a,int b){
        if(a <= 0 || b <= 0){
            return "0 0";
        }
        for (int i = A; i >= 1; i--) {
            for (int j = B; j >=1; j--) {
                if(b*i == a*j){
                    return i + " " + j;
                }
            }
        }
        return "0 0";
    }
}