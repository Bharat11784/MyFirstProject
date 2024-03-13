package com.collection.practice;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class SampleHashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> z=new HashSet<String>();
		
		z.add("one");
		z.add("two");
		z.add("three");
		z.add("ten");
		
		System.out.println(z);
		
	/*	ArrayList<String>c=new ArrayList<String>();
		c.add("seven");
		c.add("eight");
		c.add("nine");
		System.out.println(c);  */
		
		//set to list
		
		ArrayList<String>l=new ArrayList<String>(z);
		System.out.println(l);
		
		//list to set
		
		 z=new HashSet<>(l);
		System.out.println(z);

	}

}
