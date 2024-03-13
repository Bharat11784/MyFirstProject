package com.tech.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> k1=new ArrayList<Integer>();
		
		k1.add(90);
		k1.add(80);
		k1.add(70);
		k1.add(60);
		k1.add(50);
		System.out.println(k1);
		
		//contain method//
	
		System.out.println(k1.contains(70));
		System.out.println(k1.contains(90));
		
		//is empty;
		
		if(k1.isEmpty()) {
			
			System.out.println("list is empty");
		}
		else {
			System.out.println("list is not empty");
		}
		
		
		//sort-ascending order
		
		Collections.sort(k1);
		System.out.println(k1);
		
		//sort decending order

		Collections.sort(k1,Collections.reverseOrder());
		
		System.out.println(k1);
		
		//clone
		
		ArrayList clonedlist=(ArrayList)k1.clone();
		System.out.println(clonedlist); 
		
		
		//size
		
		System.out.println(k1.size());
		
		//clear method
		
		k1.clear();
		System.out.println(k1);
		

	}

}
