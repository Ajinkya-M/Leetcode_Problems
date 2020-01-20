package com.vmware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnimalPrintTree {

	public static void main(String[] args) {
		List<Relation> l = new ArrayList<Relation>();
		l.add(new Relation("animal", "mammal"));
		l.add(new Relation("animal", "bird"));
		l.add(new Relation("lifeForm", "animal"));
		l.add(new Relation("cat", "lion"));
		l.add(new Relation("mammal", "cat"));
		l.add(new Relation("animal", "fish"));
		
		Map<String, List<String>> mp = new HashMap<String, List<String>>();
		Set<String> notRoot = new HashSet<String>();
		for(Relation r : l) {
			notRoot.add(r.child);
			if(!mp.containsKey(r.parent)) {
				List<String> list = new ArrayList<String>();
				list.add(r.child);
				mp.put(r.parent, list);
			}
			else {
				List<String> list = mp.get(r.parent);
				list.add(r.child);
				mp.put(r.parent, list);
			}
		}
		String parent = null;
		for(Relation r : l) {
			if(!notRoot.contains(r.parent)) {
				parent = r.parent;
			}
		}
		if(parent == null) return;
		dfs(parent, mp, "");
	}
	static void dfs(String parent, Map<String, List<String>> mp, String pre) {
		System.out.println(pre+parent);
		if(!mp.containsKey(parent)) {
			return;
		}
		for(int i=0;i<mp.get(parent).size();i++) {
			dfs(mp.get(parent).get(i), mp, pre+" ");
		}
		return;
	}

}
class Relation {
	String parent;
	String child;
	public Relation(String parent, String child) {
		super();
		this.parent = parent;
		this.child = child;
	}
	
}
