package com.skynet.day01;

import java.util.Arrays;

import org.testng.annotations.Test;

public class DaY07 {
	private String[] arr = { "aaa", "vvv", "ccc" };

	@Test
	public void case1() {
		for (String x : arr) {
			System.out.println(x);
		}
	}

	@Test
	public void case2() {
		Arrays.asList(arr).forEach(uname -> System.out.println(uname));
	}

	@Test
	public void case3() {
		Arrays.asList(arr).forEach(System.out::println);
	}
}
