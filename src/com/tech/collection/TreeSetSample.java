package com.tech.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[]args) {
		
		TreeSet<String> bs=new TreeSet<String>();
		
		//bs.add(null);
		bs.add("red");
		bs.add("blue");
		bs.add("null");
		bs.add("white"); 
		
	//	System.out.println(bs);
		
		Iterator<String> itr=bs.iterator();       //Iterator-Ascending order
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		
		Iterator<String> itr1=bs.descendingIterator();   //Iterator Descending order
		
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
		
		
		System.out.println();
		
		System.out.println(bs.pollFirst());   ///--lowest value
		
		System.out.println(bs.pollLast());    //--Highest value
		
		
		System.out.println();
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
