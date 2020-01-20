package com.vmware;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class GrpahList {

	public static void main(String[] args) {
		List<Integer> g[] = new List[5];
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		for(int i=0;i<e;i++) {
			get(sc.nextInt(),sc.nextInt(),g);
		}
		for(int i=0;i<5;i++) {
			System.out.print(i + " :");
			for(int j=0;g[i] != null && j<g[i].size();j++) {
				System.out.print(g[i].get(j));
			}
			System.out.println();
		}
		int h = BFS(1,g);
	}

	/**
	 * test case
	 * 4
[[1,0],[1,2],[1,3]]
	 * @param s
	 * @param g
	 * @return
	 */
	private static int BFS(int s, List<Integer>[] g) {
		int n = g.length;
		int []vis = new int[n];
		int ret = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		vis[s] = 1;
		while(!q.isEmpty()) {
			int len = q.size();
			ret++;
			for(int i=0;i<len;i++) {
				int v = q.poll();
				if(g[v].size() == 1) {
					return ret;
				}
				for(int k=0;k<g[v].size();k++) {
					if(vis[g[v].get(k)] == 0) {
						vis[g[v].get(k)] = 1;
						q.add(g[v].get(k));
					}
				}
			}
		}
		return -1;
	}

	private static void get(int i, int j, List<Integer>[] g) {
		if(g[i] == null) {
			g[i] = new ArrayList<Integer>();
		}
		if(g[j] == null) {
			g[j] = new ArrayList<Integer>();
		}
		g[i].add(j);
		g[j].add(i);
	}

}
