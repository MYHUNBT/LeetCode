package com.neusoft;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/24 19:44
 */

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int a = Integer.parseInt(split[2]);
        int b = Integer.parseInt(split[3]);
        int arr[] = new int[A];
        int brr[] = new int[B];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < brr.length; i++) {
            brr[i] = i+1;
        }
        int maxArr[] = new int[arr.length*brr.length+1];
        int index= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                maxArr[index] = arr[i]*brr[i];
                index++;
            }
        }
        Arrays.sort(maxArr);
        int max = maxArr[arr.length*brr.length-1];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if(arr[i]/brr[i] == a/b && arr[i]*brr[i] == max){
                    System.out.println(arr[i] + " " + brr[i]);
                    flag = false;
                }
            }
        }
        if (flag){
            System.out.println("0 0");
        }

    }
}
