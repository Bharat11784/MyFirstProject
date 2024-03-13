package com.tech.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListSample2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> h1=new ArrayList<Integer>();
		
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		
		System.out.println(h1);

		//Iterator//
		
		Iterator<Integer> itr=h1.iterator();
		
		while(itr.hasNext()) 
			System.out.println(itr.next());
		
		
		//List Iterator//
		
		ListIterator<Integer> itr1=h1.listIterator();
		
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		System.out.println();
		System.out.println();
		
		while(itr1.hasPrevious())
			System.out.println(itr1.previous());
		
		
		// remove //
		
		System.out.println(h1.remove(2));
		System.out.println(h1);
		System.out.println(h1.remove(3));
		System.out.println(h1);
		System.out.println(h1.remove(1));
		System.out.println(h1);
		System.out.println(h1.removeAll(h1));
		System.out.println(h1);
		
	
		
	}

}
