package com.skynet.day01;

import org.testng.annotations.Test;

public class DaY05 {
	public int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			result = 0;
		return (int) result;

	}

	@Test
	public void test_001() {
		System.out.println(new DaY05().reverse(123));
	}
}
