package com.skynet.day2021;

import org.junit.Test;

import java.util.Arrays;

public class LeetCode2021 {
    /***
     * https://leetcode-cn.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i = 0;
        for (; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    arr[0] = i;
                    arr[1] = j;
                }

            }
        }
        return arr;
    }

    @Test
    public void testcase_001() {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
