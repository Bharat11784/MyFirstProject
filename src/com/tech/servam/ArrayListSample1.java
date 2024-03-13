package com.tech.servam;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample1 {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2); list.add(5); list.add(4); list.add(3);
		
		System.out.println(list);
		System.out.println();
		
		//contains//
		System.out.println(list.contains(5));
		
		//is empty//
		System.out.println(list.isEmpty());
		System.out.println();
		
		//Ascending order//
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println();
		
		//descending order//
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println();
		
		//cloned method//
		
		ArrayList clonedlist=(ArrayList)list.clone();
		System.out.println(clonedlist);
		
		System.out.println();
		
		//size//
		
		System.out.println(list.size());
		System.out.println();
		
		//clear method//
		
		list.clear();
		System.out.println(list);
		
	}

}
