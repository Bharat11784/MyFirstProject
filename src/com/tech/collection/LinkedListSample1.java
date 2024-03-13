package com.tech.collection;

import java.util.LinkedList;

public class LinkedListSample1 {

	public static void main(String[] args) {
		
		LinkedList<String> j1=new LinkedList<String>();
		
		j1.add("B");
		j1.add("H");
		j1.addFirst("S");  //-------
		j1.addLast("P");   //-------Deque Interface method
		
		System.out.println(j1);
		
		j1.remove("B");
		j1.removeFirst();
		j1.removeLast();

		System.out.println(j1);
		

	}

}
