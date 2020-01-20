package com.vmware;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		String s = "y#fo##f";
		String t = "y#f#o##f";
		Integer k = Integer.parseInt("093");
		System.out.println(k);
		StringBuilder str1 = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '#') {
				if(str1.length() > 0)
					str1.deleteCharAt(str1.length()-1);
			}
			else {
				str1.append(s.charAt(i));
			}
		}
		System.out.println(str1.toString());
		
		StringBuilder str2 = new StringBuilder();
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i) == '#') {
				if(str2.length() > 0)
					str2.deleteCharAt(str2.length()-1);
			}
			else {
				str2.append(t.charAt(i));
			}
		}
		System.out.println(str2.toString());
		
		if(str1.toString().compareTo(str2.toString()) == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
