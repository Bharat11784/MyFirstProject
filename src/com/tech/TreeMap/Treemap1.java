package com.tech.TreeMap;
import java.util.TreeMap;    
public class Treemap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> t=new TreeMap<Integer,String>();
		
		t.put(666, "Bharat");
		t.put(111, "mahanth");
		t.put(444, "navami");
		t.put(333, "savita");
		
		System.out.println(t);
	}
}

// natural sorting order//

// to add one collection data in to another collection by two methods
//  1. addall or putall method
//  2. by constructor Apporach    