package com.vmware;

import java.util.*;
import java.util.stream.Stream;

public class PracticeStream {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		HashSet<String> hs = new HashSet<String>();
		hs.add("flew");
		hs.add("wind");
		stringList.add("One flew over the cuckoo's nest".replaceAll("[^a-zA-Z0-9 ]", ""));
		stringList.add("To, kill a muckingbird".replaceAll("[^a-zA-Z0-9 ]", ""));
		stringList.add("Gone with the wind");
		Stream<String> stream = stringList.stream();
		List<String> ret = new ArrayList<String>();
		stream.flatMap((value) -> {
		    String[] split = value.split(" ");
		    return (Stream<String>) Arrays.asList(split).stream();
		})
		.map((value) -> value.toUpperCase())
		.forEach((value) -> {if(hs.contains(value.toLowerCase())) ret.add(value);});
		System.out.println(ret);
	}

}
