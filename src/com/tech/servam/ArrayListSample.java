package com.tech.servam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListSample {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(new Integer(1));
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		System.out.println();
		
		//Iterator//
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		System.out.print(itr.next()+ "  ");
		
		System.out.println();
		
		//removal//
		
		System.out.print(list.remove(1));
		System.out.println(list);
		
		System.out.println();
		
		//ListIterator//
		
		ListIterator i=list.listIterator();
		while(i.hasNext())
		System.out.print(i.next()+ "  ");
		
		System.out.println();
		
		
		while(i.hasPrevious())
		System.out.print(i.previous()+ " ");
		
	}

}
