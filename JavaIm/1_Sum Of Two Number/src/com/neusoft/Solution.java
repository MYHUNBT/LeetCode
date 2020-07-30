package com.neusoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/6/19 16:38
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
