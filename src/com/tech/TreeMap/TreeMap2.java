package com.tech.TreeMap;
import java.util.TreeMap;
public class TreeMap2 {
	public static void main(String[] args) {
		// Constructor Approach//
		
		TreeMap<Integer,String> m1=new TreeMap<Integer,String>();
		
		m1.put(444, "savita");
		m1.put(222, "navami");
		
		TreeMap<Integer,String>m2=new TreeMap<Integer,String>(m1);
		m2.put(111, "mahanth");
		
		System.out.println(m2);
		
		
		//putall method//
		
		TreeMap<Integer,String>s1=new TreeMap<Integer,String>();
		s1.put(666, "vdit");
		s1.put(555, "nmam");
		
		TreeMap<Integer,String>c1=new TreeMap<Integer,String>();
		
		c1.put(999, "kle");
		
		TreeMap<Integer,String>v1=new TreeMap<Integer,String>();
		v1.put(111, "ssc");
		v1.putAll(c1);
		v1.putAll(s1);
		System.out.println(v1);
	}
}

//How to add one collection data in to another collection by two methods or how to add one map data to another map data structure
//1. addall or putall method
//2. by constructor Apporach   