package com.vmware;


import java.util.Arrays;
import java.util.Comparator;

public class AbsoluteSort {

	public static void main(String[] args) {
		Integer []arr = {12,34,23,67,1984};
		Arrays.sort(arr, (a,b)-> {
			String s1 = a.toString();
			String s2 = b.toString();
			return Integer.parseInt(s2+s1) - Integer.parseInt(s1+s2);
		});
		String ret = "";
		for(Integer a: arr) {
			ret += a.toString();
		}
		System.out.println(ret);
	}

}
