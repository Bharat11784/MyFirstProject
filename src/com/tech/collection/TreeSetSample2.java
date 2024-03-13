package com.tech.collection;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;
public class TreeSetSample2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> numset=new TreeSet<Integer>();
		
		numset.add(30);
		numset.add(40);
		numset.add(10);
		numset.add(25);
		
		System.out.println(numset);
		
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		
	    mylist.add(15);
	    mylist.add(28);
	    mylist.add(12);
	    mylist.add(56);
	    
	    System.out.println(mylist);
	    
	    // Add ArrayList elements to TreeSet//
	    
	    numset.addAll(mylist);
	    
	    System.out.println(numset);
	    
	    System.out.println();
	    
	    //ceiling()

	    System.out.println(numset.ceiling(12));
	    
	    //floor
	    System.out.println(numset.floor(10));
	    
	    System.out.println();
	    
	    // first,last,headset,tailset,subset//
	    
	    System.out.println(numset.first());
	    
	    System.out.println(numset.last());
	    
	    System.out.println(numset.headSet(25));
	    
	    System.out.println(numset.tailSet(28));
	    
	    System.out.println(numset.subSet(15, 30));
	    
	    
	    System.out.println();
	    
	    //contains//
	    
	    System.out.println(numset.contains(15));
	    
	    System.out.println(numset.size());
	    
	    System.out.println(numset.remove(28));
	    
	    System.out.println(numset);
	    
	    
	    
	    Iterator<Integer> itr=numset.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println();
	    
	    Iterator<Integer> itr1=numset.descendingIterator();
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	    
	}

}
