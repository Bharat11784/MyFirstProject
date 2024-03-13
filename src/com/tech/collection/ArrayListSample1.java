package com.tech.collection;

import java.util.ArrayList;

public class ArrayListSample1 {
	
	public static void main(String[]args) {
		
	//	ArrayList m1=new ArrayList();
		
		ArrayList<Integer>m1=new ArrayList<Integer>();
		
		// add method - order sequence;
		
		m1.add(20);
		m1.add(30);
		m1.add(40);
		m1.add(50);
		m1.add(60);
		
		System.out.println(m1.size());
		System.out.println(m1);
		
		// overloaded method//
		
		m1.add(2, 100);
		System.out.println(m1);
		
		m1.add(4, 90);
		System.out.println(m1);
		
		
		//Add all method//
		
		ArrayList<Integer> n1=new ArrayList<Integer>();
		
		n1.add(5);
		n1.add(6);
		n1.add(7);
		n1.add(8);
		
		System.out.println(n1);
		
		m1.addAll(n1);
		System.out.println(m1);
		m1.addAll(1, n1);
		System.out.println(m1);
		
		
		//remove method by index//
		
		m1.remove(2);
		System.out.println(m1);
		m1.remove(0);
		System.out.println(m1);
		
		//remove by object//
		
		m1.remove(new Integer(100));
		System.out.println(m1);
		m1.remove(new Integer(90));
		System.out.println(m1);
		
		
		//get(read) method

		System.out.println(m1.get(1));
		System.out.println(m1.get(0));
		
		//set (replace)//
		
		m1.set(0, 100);
		System.out.println(m1);
		m1.set(1, 200);
		System.out.println(m1);
		
		//index -first occurance
		
		System.out.println(m1.indexOf(50));
		System.out.println(m1.indexOf(8));
		
		System.out.println(m1.indexOf(30));
		
		//index -last index
		
		System.out.println(m1.lastIndexOf(8));
		System.out.println(m1.lastIndexOf(5));
		
		// sublist//
		
		System.out.println(m1.subList(1, 3));
		System.out.println(m1.subList(3, 7));
	}

}
