package com.collection.practice;

import java.util.ArrayList;

public class SampleArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer>t1=new ArrayList<Integer>();
		
		t1.add(5);
		t1.add(1);
		t1.add(8);
		t1.add(2);
		
		System.out.println(t1);  //order sequence//

		System.out.println();
		
		//overloaded//
		
		t1.add(1,10);
		
		System.out.println(t1);
		
		t1.add(0, 20);
		System.out.println(t1);
		
		
		System.out.println();
		
		//Add all method//
		
		ArrayList<Integer> t2=new ArrayList<Integer>();
		t2.add(90);
		t2.add(30);
		t2.add(20);
		
		System.out.println(t2);
		
		t1.addAll(t2);
		System.out.println(t1);
		t1.addAll(1, t2);
		System.out.println(t1);
		
		System.out.println();
		//remove by index and object//
		
		t1.remove(1);
		System.out.println(t1);
		
		t1.remove(new Integer(30));
		System.out.println(t1);
		
		System.out.println();
		
		//get or read method//
		
		System.out.println(t1.get(1));
		System.out.println(t1.get(2));
		
		System.out.println();
		
		//set or replace//
		
		t1.set(1, 100);
		System.out.println(t1);
		
		System.out.println();
		
		//index first occurence//
		
		System.out.println(t1.indexOf(20));
		System.out.println(t1.indexOf(100));
		
		//index of last occurence//
		
		System.out.println(t1.lastIndexOf(30));
		System.out.println(t1.lastIndexOf(20));
		
		System.out.println();
		
		//sublist//
		System.out.println(t1.subList(1, 4));
	
		
	}

}
