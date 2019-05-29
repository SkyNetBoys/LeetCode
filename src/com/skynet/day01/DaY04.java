package com.skynet.day01;

public class DaY04 {
	public String countAndSay(int n) {
		String res = "";
		
		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				res = "1";
			} else {
				res = goCount_bak(res);
			}

		}
		return res;
	}
	
	
	public static String goCount_bak(String lineStr) {
		char[] c = (lineStr + "?").toCharArray();
		int count = 1;
		//String str = "";
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
			} else {
				//str = str + count + c[i];
				build = build.append(count).append(c[i]);
				count = 1;
			}

		}
		return build.toString();
	}
	
	
	

	public static String goCount(String lineStr) {
		char[] c = (lineStr + "?").toCharArray();
		int count = 1;
		String str = "";
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
			} else {
				str = str + count + c[i];
				count = 1;
			}

		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(new DaY04().countAndSay(5));
	}
}
