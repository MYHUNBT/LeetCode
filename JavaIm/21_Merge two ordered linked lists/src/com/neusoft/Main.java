package com.neusoft;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Random random = new Random();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(random.nextInt(21));
//        }
//        f(list);
        System.out.println(8/2);
        System.out.println(8>>1);
    }

    public static void f(ArrayList<Integer> arr){
        int[] temp = new int[21];
        for (int i = 0; i < arr.size(); i++) {
            temp[arr.get(i)]++;
        }

        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < temp[i]; j++) {
                System.out.println(i);
            }
        }
    }
}
