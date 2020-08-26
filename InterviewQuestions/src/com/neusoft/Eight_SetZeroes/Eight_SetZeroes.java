package com.neusoft.Eight_SetZeroes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/8/23 16:00
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * 先找到为0元素的i和j ，放入数组，遍历清零
 */

public class Eight_SetZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] arr2 = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
//        arr[1] = new int[]{0,0,0};
//        System.out.println(Arrays.toString(arr[1]));
        setZeroes(arr2);
    }
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> listI = new ArrayList<>();
        ArrayList<Integer> listJ = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    listI.add(i);
                    listJ.add(j);
                }
            }
        }
        for (int i = 0; i < listI.size(); i++) {
            matrix[listI.get(i)] = new int[matrix[listI.get(i)].length];
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][listJ.get(i)] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
