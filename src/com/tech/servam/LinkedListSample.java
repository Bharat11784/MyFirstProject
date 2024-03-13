package com.tech.servam;

import java.util.LinkedList;

public class LinkedListSample {
	public static void main(String[]args) {
		
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("b");
		l1.add("h");
		l1.addFirst("s");
		l1.addLast("mn");
		System.out.println(l1);
		
		System.out.println();
		
		l1.remove("mn");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		System.out.println();
		
		l1.set(0, "for");
		System.out.println(l1);
		
		
	}

}
