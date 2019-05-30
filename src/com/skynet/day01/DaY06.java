package com.skynet.day01;

public class DaY06 {
	public static boolean isPalindrome(int x) {

		StringBuilder builderA = new StringBuilder(String.valueOf(x));
		StringBuilder builderB = new StringBuilder(builderA.reverse());
		if (String.valueOf(x).equals(builderB.toString())) {
			return true;
		} else {
			return false;
		}

	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(-12312));
	}
}
