package com.vmware;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cents = sc.nextInt();
		int[] coins = {25, 5, 1};
		System.out.println(getCount(cents, coins));
		System.out.println(getMinCount(cents, coins));
	}

	private static int getMinCount(int cents, int[] coins) {
		if(coins.length == 0 || cents == 0) return 0;
		return (getMinCountRec(cents, coins, 0));
	}

	private static int getMinCountRec(int cents, int[] coins, int i) {
		if(cents == 0) return 1;
		if(i == coins.length) return 10000;
		int incl = 10000;
		if(cents > coins[i]) {
			incl  = 1 + getMinCountRec(cents-coins[i], coins, i);
		}
		int excl = getMinCountRec(cents, coins, i+1);
		
		return Math.min(incl, excl);
	}

	private static int getCount(int cents, int[] coins) {
		int cnt = 0;
		for(int i=0;i<coins.length && cents>0;i++) {
			cnt += cents/coins[i];
			cents = cents % coins[i];
		}
		if(cents == 0) {
			return cnt;
		}
		return 0;
	}

}
