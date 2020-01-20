package com.vmware;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PQTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b - a);
		int  t = sc.nextInt();
		while(t-- > 0) {
			pq.add(sc.nextInt());
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}

}
