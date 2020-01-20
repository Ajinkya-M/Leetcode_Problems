package com.vmware;

import java.util.Collections;
import java.util.PriorityQueue;

public class MainLL {

	public static void main(String[] args) {
		LL l = new LL();
		l.printLL();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(12);
		pq.add(11);
		System.out.println(pq.poll());
	}

}
class Node{
	public int val;
	public Node next;
	
	@Override
	public String toString() {
		return "Node [val=" + val + ", next=" + next + "]";
	}

	Node(int x){
		val = x;
		next = null;
	}
}
class LL{
	public Node head;
	public int size;
	
	public void add(int x) {
		size++;
		if(head == null) {
			head = new Node(x);
		}else {
			Node p = head;
			while(p.next != null) {
				p=p.next;
			}
			p.next = new Node(x);
		}
	}
	
	public void printLL() {
		Node p;
		for(p=head; p!=null; p=p.next) {
			System.out.println(p.val + " ");
		}
	}
}
