package com.vmware;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinatinsString {

	public static void main(String[] args) {
		String s = "abc";
		List<String> ret = new ArrayList<String>();
		util(s.toCharArray(), ret, 0, new StringBuilder());
		for(String c : ret) {
			System.out.println(c);
		}
	}

	private static void util(char[] s, List<String> ret, int i, StringBuilder str) {
		if(i == s.length-1) {
			str.append(s[s.length-1]);
			ret.add(new String(str));
			str.deleteCharAt(str.length()-1);
			return;
		}
		for(int j=i;j<s.length;j++) {
			str.append(s[j]);
			for(int k=j+1;k<s.length;k++) {
				char t = s[j];
				s[j] = s[k];
				s[k] = t;
				util(s, ret, k, str);
			}
			str.deleteCharAt(str.length()-1);
		}
		return;
	}

}
