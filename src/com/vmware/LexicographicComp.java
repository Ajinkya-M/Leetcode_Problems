package com.vmware;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class LexicographicComp {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		Deque<Integer> dq = new LinkedList<Integer>();
		SortedMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
		mp.put(1,10);
		mp.put(-1,-10);
		mp.put(-2,30);
		mp.put(3,40);
		for(Entry<Integer, Integer> e :  mp.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		dq.addFirst(10);
		dq.addLast(20);
		dq.removeFirst();
		dq.peekFirst();
		System.out.println(dq);
		l.add(12);
		l.add(13);
		l.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		int []a = l.stream().mapToInt(i->i.intValue()).toArray();
		System.out.println(l);
		for(int i : a) {
			System.out.print(i);
		}
	}

}
