package com.vmware;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 123;
		Integer i = new Integer(x);
		StringBuilder num = new StringBuilder(i.toString());
		if(num.charAt(0) == '-') {
			num.deleteCharAt(0);
			num.reverse();
			num.insert(0, '-');
			System.out.println(Integer.parseInt(num.toString())); 
		}
		else {
			System.out.println(Integer.parseInt(num.reverse().toString()));
		}
		System.out.println((-7/2));
	}

}
