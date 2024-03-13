package com.tech.TreesetComparator;
import java.util.Comparator;
import java.util.TreeSet;
public class DefaultNaturalSortingTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>(new MyComp());

		t.add("navami");
		t.add("mahanth");
		t.add("savita");
		t.add("bharat");
		
		System.out.println(t);     // Default natural sorting order and customized sorting order//
	}
}

class MyComp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
}