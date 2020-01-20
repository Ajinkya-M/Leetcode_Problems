package com.vmware;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class ComparatorInPQ {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		int g[][] = new int [3][4];
		System.out.println(g.length);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(13);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.add(17);
		l.add(18);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return l.get(o2) - l.get(o1);
			}
		});
		
		pq.add(3);
		pq.add(1);
		pq.add(4);
		pq.add(5);
		pq.add(2);
		pq.add(6);
		pq.add(0);
		
		while(!pq.isEmpty()) {
			System.out.println(l.get(pq.poll()));		}
	}

}
