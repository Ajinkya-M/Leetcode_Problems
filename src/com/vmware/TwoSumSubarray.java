package com.vmware;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSubarray {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		int k = 3;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		mp.put(0, 1);
		int sum = 0;
		int cnt = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			if(mp.containsKey(sum-k)) {
				cnt += mp.get(sum-k);
			}
			mp.put(sum, mp.getOrDefault(sum, 0)+1);
		}
		System.out.println(cnt);

	}

}
