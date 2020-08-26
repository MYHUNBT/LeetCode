package com.neusoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liuboting
 * @date 2020/8/14 8:50
 */

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        System.out.println(Arrays.toString(solution(nums, 6)));
    }
    public static int[] solution(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                System.out.println(map.values());
                return new int[]{i,map.get(target - nums[i])};
            }


        }
        return null;
    }
}
