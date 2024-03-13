package com.tech.collection;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class HashSetSample1 {
	
	public static void main(String[]args) {
		HashSet<String> hj=new HashSet<String>();
		
		hj.add("one");
		hj.add("two");
		hj.add("three");
		hj.add("four");
		hj.add("five");
		
		System.out.println(hj);
		
		//set to List//
		
		List<String> nm=new ArrayList<String>(hj);
		
		System.out.println(nm);
		
		
		//List to Set//
		
		HashSet<String> bv=new HashSet<String>(nm);
		
		System.out.println(bv);
		
		
		
	}

}
