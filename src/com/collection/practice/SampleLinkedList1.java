package com.collection.practice;

import java.util.LinkedList;

public class SampleLinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> d=new LinkedList<String>();
		
		d.add("hi");
		d.add("hellow");
		d.add("dude");
		d.add("how");
		
		System.out.println(d);
		
		d.addFirst("bghj");
		d.addLast("opiu");
		System.out.println(d);
		
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		System.out.println(d.removeFirst());
		System.out.println(d.removeLast());
		
		
	}

}
