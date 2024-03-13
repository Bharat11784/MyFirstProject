package com.collection.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleLinkedList2 {

	public static void main(String[] args) {
		
		LinkedList<String> m=new LinkedList<String>();
		
		m.add("yui");
		m.add("aarusu");
		m.add("gg");
		m.add("james");
		System.out.println(m);
		
		Iterator<String> itr=m.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
