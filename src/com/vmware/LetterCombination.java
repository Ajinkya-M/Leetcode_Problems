package com.vmware;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombination {

	public static void main(String[] args) {
		String str = "abcdfe";
		List<String> ret = new ArrayList<String>();
		util("", str, ret);
		System.out.println(ret.size());
	}
	
	static void util(String pref, String suff, List<String> ret) {
		if(suff.length() == 0) {
			ret.add(new String(pref));
			return;
		}
		for(int i=0;i<suff.length();i++) {
			util(pref+suff.charAt(i), suff.substring(0, i) + suff.substring(i+1, suff.length()), ret);
		}
		return;
	}
}
