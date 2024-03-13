package com.collection.practice;

import java.util.ArrayList;
import java.util.TreeSet;

public class SampleTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> j=new TreeSet<String>();
		
		j.add("ball");
		j.add("paper");
		j.add("pen");
		j.add("bat");
		
		System.out.println(j);
		
		ArrayList<String>k=new ArrayList<String>();
		k.add("school");
		k.add("college");
		k.add("bus");
		
		j.addAll(k);
		System.out.println(j);
		
	//	System.out.println(j.pollFirst());
	//	System.out.println(j.pollLast());
		
		System.out.println(j.first());
		System.out.println(j.last());
		
		System.out.println(j.headSet("bus"));
		System.out.println(j.tailSet("college"));
		
		System.out.println(j.subSet("bat", "paper"));
		

	}

}
