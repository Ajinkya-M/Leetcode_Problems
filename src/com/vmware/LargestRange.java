package com.vmware;

import java.util.*;

public class LargestRange {

	public static void main(String[] args) {
		int array [] = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
		Set<Integer> s = new HashSet<>();
		for(int a : array) {
			s.add(a);
		}
		int ret[] = {-1, -1};
		int max = Integer.MIN_VALUE;
		for(int p : array) {
			int cnt = 0;
			int st = p;
			while(s.contains(st)) {
				cnt++;
				s.remove(st);
				st--;
			}
			int e = p+1;
			while(s.contains(e)) {
				cnt++;
				s.remove(e);
				e++;
			}
			if(cnt > max) {
				ret[0] = st+1;
				ret[1] = e-1;
				max = cnt;
			}
			
		}
		for(int a : ret) {
			System.out.println(a);
		}

	}

}
