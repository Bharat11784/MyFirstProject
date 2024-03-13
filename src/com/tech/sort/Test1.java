package com.tech.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("mahanth");
		al.add("navami");
		al.add("savita");
		al.add("bharat");
		
		System.out.println("before sorting :" +al);
		
		Collections.sort(al);
		
		System.out.println("after sorting:" +al);
		
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(50);
		l.add(20);
		l.add(10);
		l.add(80);
		
		System.out.println("before sorting:" +l);
		
		Collections.sort(l);
		
		System.out.println("after sorting:" +l);

	}

}
