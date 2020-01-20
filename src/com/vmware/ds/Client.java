package com.vmware.ds;

public class Client {

	public static void main(String[] args) {
		Cache lru = new LRUCache(3);
		lru.put(1, new Account(1, "saving", "MFH"));
		lru.put(2, new Account(2, "test", "MFH"));
		lru.put(3, new Account(3, "ng", "MFH"));
		lru.get(1);
		lru.put(4, new Account(4, "desh", "MFH"));
		lru.printCache();
		System.out.println("**************");
		
		String []strs = {
				"eat","tea","tan","ate","nat","bat"
		};
		TrieDS t = new TrieDS(strs);
		t.insertToTrie("Bat");
		System.out.println(t.isPresent("Bat"));
		
	}

}
