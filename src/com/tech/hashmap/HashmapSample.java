package com.tech.hashmap;
import java.util.*;
public class HashmapSample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();
	//	TreeMap<Integer,String> m=new TreeMap<Integer,String>();
		m.put(101, "bharat");
		m.put(102, "savita");
		m.put(103, "navami");
		m.put(104, "mahanth");
		m.put(101, "xyz");
		
		System.out.println(m);
		
		HashMap<Integer,String> n=new HashMap<Integer,String>();
		n.put(105, "vdit");
		n.put(106, "tce");
		n.put(107, "lhs");
		n.put(108, "kle");  
		
		m.putAll(n);
		System.out.println(m);
		
		
		System.out.println(n.get(105));
		
		System.out.println(n.remove(106));
		System.out.println(n);
		
		System.out.println(m.containsKey(102));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.containsValue("savita")); 
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());  
		
		for(Object i:m.keySet()) {
			System.out.println(i);
		}
		
		for(Object i:m.values()) {
			System.out.println(i);
		}
		
		for(Object i:m.keySet()) {
			System.out.println(i+ "   " +m.get(i));
		}  
		

	}

}
