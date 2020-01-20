package com.vmware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubsetSumK {

	public static int cnt = 0;
	public static void main(String[] args) {
		
		int[] arr = new int[300];
		for(int i=0;i<300;i++) {
			arr[i] = i;
		}
		int k = 1200;
		List<Integer> l = new ArrayList<Integer>();
		findsubsets(arr,0,k,l);
		System.out.println("final cont is :"+ cnt);
	}

	private static void findsubsets(int[] arr, int i, int k, List<Integer> l) {
		if(k<0) return;
		if(k == 0) {
			System.out.println(l);
			cnt++;
			return;
		}
		if(i>=arr.length) return;
		l.add(arr[i]);
		findsubsets(arr, i+1, k-arr[i], l);
		l.remove(l.size()-1);
		findsubsets(arr, i+1, k, l);
		return;
	}

}
