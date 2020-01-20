package com.vmware;

import java.util.HashMap;
import java.util.Map;

public class ConvertToDecimal {

	public static void main(String[] args) {
		int num = 10;
		int den = 3;
		String ret = "";
		ret = ret + String.valueOf(num/den);
		if(num % den == 0) {
			System.out.println(ret);
			return;
		}
		ret += ".";
		String q = "";
		int index = 0;
		int r = num % den;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		while(r != 0) {
			if(r < den) {
				r *= 10;
				System.out.println("r is :" + r);
			}
			q += String.valueOf(r / den);
			r = r % den;
			if(mp.containsKey(r)) {
				q = q.substring(0, mp.get(r)-1) + "(" + q.substring(mp.get(r)-1) + ")";
				break;
			}
			mp.put(r, q.length());
		}
		ret += q;
		System.out.println(ret);
		
		
	}

}
