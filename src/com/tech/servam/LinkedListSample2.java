package com.tech.servam;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListSample2 {
	
	public static void main(String[]args) {
		
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("hi");
		l1.add("dude");
		l1.add(1, "by");
		
		System.out.println(l1);
		
		System.out.println(l1.size());
		
		System.out.println();
		
		System.out.println(l1.contains("dude"));
		System.out.println(l1.contains("by"));
		
		System.out.println();
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		System.out.println();
		System.out.println(l1.indexOf("hi"));
		System.out.println(l1.lastIndexOf("by"));
		
		System.out.println();
		
		//to convert linked list to array//
		
		
		String stringArray[]=new String[l1.size()];
		
		stringArray=l1.toArray(stringArray);
		System.out.println(Arrays.toString(stringArray));
		
	}

}
