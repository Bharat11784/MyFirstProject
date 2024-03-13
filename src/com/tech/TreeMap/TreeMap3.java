package com.tech.TreeMap;
import java.util.SortedMap;
import java.util.TreeMap;
public class TreeMap3 {
	public static void main(String[] args) {
		TreeMap<Integer,String> r1=new TreeMap<Integer,String>();
		r1.put(80, "vdit");
		r1.put(10, "kls");
		r1.put(90, "lhs");
		r1.put(5, "kle");
		
		System.out.println(r1);
		
	SortedMap<Integer,String>sm1=r1.subMap(5, 80);
	
	TreeMap<Integer,String>r2=new TreeMap<Integer,String>(sm1);
	
	System.out.println(r2);

	}

}
