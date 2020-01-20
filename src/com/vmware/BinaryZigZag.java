package com.vmware;

import java.util.LinkedList;

public class BinaryZigZag {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addFirst(12);
		l.addLast(23);
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
	}

}
