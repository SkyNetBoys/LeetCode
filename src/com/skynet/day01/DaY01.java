package com.skynet.day01;

import java.util.HashMap;

public class DaY01 {
	public static int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i=0;i<nums.length;i++) {
			int b = target-nums[i];
			if(map.containsKey(b) && map.get(b)!=i) {
				answer[0] = i;
				answer[1] = map.get(b);
				break;
				
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int target = 8;
		for(int x : twoSum(arr, target)) {
			System.out.println(x);
		}
	}
}
