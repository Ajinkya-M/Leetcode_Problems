package com.vmware.ds;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache implements Cache {

	int size;
	int capacity;
	Map<Integer, Account> mp;
	LinkedList<Account> l;
	
	public LRUCache(int cap) {
		this.capacity = cap;
		mp = new HashMap<Integer, Account>();
		l = new LinkedList<Account>();
	}
	
	@Override
	public Object get(int key) {
		if(mp.containsKey(key)) {
			Account o = mp.get(key);
			l.remove(o);
			l.addFirst(o);
			System.out.println(o);
			return o;
		}
		return null;
	}

	@Override
	public void put(int key, Account val) {
		if(mp.containsKey(key)) {
			Account o = mp.get(key);
			l.remove(o);
			l.addFirst(o);
			return;
		}
		if(size >= capacity) {
			//need eviction
			Account o = l.pollLast();
			mp.remove(o.getAccNo());
		}
		mp.put(key, val);
		l.addFirst(val);
		size++;
	}
	
	public void printCache() {
		for(Integer k : mp.keySet()) {
			System.out.println(k + " : " + mp.get(k));
		}
	}

}
