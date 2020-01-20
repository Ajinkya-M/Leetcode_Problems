package com.vmware;

import java.util.Deque;
import java.util.LinkedList;

public class SolutionDQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> d = new LinkedList<Integer>();
		d.add(10);
		d.add(11);
		d.add(12);
		
		d.addFirst(9);
		d.addFirst(8);
		System.out.println(d.pollLast());
		while(!d.isEmpty()) {
			System.out.println(d.poll());
		}
	}

}
