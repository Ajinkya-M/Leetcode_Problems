package com.vmware;

import java.util.Arrays;

public class SortCharofString {

	public static void main(String[] args) {
		String s = "ajinkya";
		char []arr = s.toCharArray();
		Arrays.sort(arr);
		System.out.println(String.valueOf(arr) + " " + s);
	}

}
