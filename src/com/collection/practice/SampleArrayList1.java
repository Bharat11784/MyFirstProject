package com.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class SampleArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> e1=new ArrayList<Integer>();
		
		e1.add(45);
		e1.add(21);
		e1.add(78);
		e1.add(65);
		
		System.out.println(e1);
		
		Iterator<Integer> itr=e1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*ListIterator<Integer> itr1=e1.listIterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}*/
		

		
		
	}

}
