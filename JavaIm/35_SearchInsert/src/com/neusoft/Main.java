package com.neusoft;
/*
* 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
* 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
* 你可以假设数组中无重复元素。
*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] ints = new int[]{1,3,5,6};
        int target = 5;
        System.out.println(searchInsert2(ints,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if(nums[i] >= target){
                return i;
            }
        }
        return i;
    }
    public static int searchInsert2(int[] nums, int target){
        int start = 0;
        int end = nums.length;
        if(target <= nums[0]) return 0;
        for (int i = start; i < end; i++) {
            if(target == nums[(start+end)/2]){
                return (start+end)/2;
            }else if(target > nums[(start+end)/2]){
                start = (start+end)/2;
            }else {
                end = (start+end)/2;
            }
        }
        return end;
    }
}
