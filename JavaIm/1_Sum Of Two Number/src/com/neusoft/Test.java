package com.neusoft;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/6/19 16:41
 */

public class Test {
    public static void main(String[] args){
        System.out.println("请输入一个数组:");
        Scanner Scanner = new Scanner(System.in);
        String str = Scanner.nextLine();
        System.out.println("请输入目标值:");
        int target = Scanner.nextInt();
        String strList[] = str.split(" ");
        int nums[] = new int[strList.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(strList[i]);
        }
        Solution solution = new Solution();
        int[] twoSum = solution.twoSum(nums, target);
//        Arrays.sort(twoSum);
        System.out.println(Arrays.toString(twoSum));
//        System.out.print("[");
//        for (int i = 0; i < twoSum.length; i++) {
//            if(i != twoSum.length-1){
//                System.out.print(twoSum[i] + ",");
//            }else{
//                System.out.print(twoSum[i]);
//            }
//        }
//        System.out.println("]");
    }
}
