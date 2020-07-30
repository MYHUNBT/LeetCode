package com.neusoft.bettersolution;

import java.util.HashMap;

/**
 * @author liuboting
 * @date 2020/7/1 11:38
 */

public class Solution {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp) && map.get(temp) != i){
                return new int[]{i,map.get(temp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
