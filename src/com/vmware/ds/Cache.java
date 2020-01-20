package com.vmware.ds;

public interface Cache {
	public Object get(int key);
	public void put(int key, Account val);
	void printCache();
}
