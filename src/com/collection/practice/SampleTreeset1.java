package com.collection.practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SampleTreeset1 {

	public static void main(String[] args) {
		
		TreeSet<String>k=new TreeSet<String>(new Mycomp());
		
		k.add("bnmv");
		k.add("yugf");
		k.add("sdfg");
		k.add("qwer");
		
		System.out.println(k);

	}

}
class Mycomp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
	
	
}
