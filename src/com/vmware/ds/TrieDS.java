package com.vmware.ds;

import java.util.List;

public class TrieDS {
	TrieNode root;
	public TrieDS() {
		root = new TrieNode(' ');
	}
	
	public TrieDS(String[] l) {
		root = new TrieNode(' ');
		for(String s : l) {
			insertToTrie(s);
		}
	}

	public void insertToTrie(String s) {
		insertToTrieUtil(root, s);
	}

	private void insertToTrieUtil(TrieNode root, String s) {
		if(s == null || s.length() == 0) {
			root.end = 1;
			return;
		}
		char ch = s.charAt(0);
		int index = ch >= 'a' && ch <= 'z' ? ch-97 : ch-65+26;
		if(root.links[index] == null) {
			root.links[index] = new TrieNode(ch);
		}
		insertToTrieUtil(root.links[index], s.substring(1));
	}
	
	public boolean isPresent(String s) {
		if(s == null || s.length() == 0) return true;
		return isPresentUtil(root, s);
	}

	private boolean isPresentUtil(TrieNode root, String s) {
		if(root == null) return false;
		if(s == null || s.length() == 0) return true;
		int ch = s.charAt(0);
		int index = ch >= 'a' && ch <= 'z' ? ch-97 : ch-65+26;
		return isPresentUtil(root.links[index], s.substring(1));
	}
}
class TrieNode {
	Character ch;
	int end;
	TrieNode[] links;
	public TrieNode(Character ch) {
		links = new TrieNode[52];
		this.ch = ch;
		end = 0;
	}
}
