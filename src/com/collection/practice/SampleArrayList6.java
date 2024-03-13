package com.collection.practice;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;



public class SampleArrayList6 {

	public static void main(String[] args) {
		
		ArrayList<String> j=new ArrayList<String>();
		j.add("two");
		j.add("three");
		j.add("five");
		j.add("six");
		
		System.out.println(j);
		
		try {
			Iterator<String> itr=j.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
				j.add("ten");
				
			}
			
			
		}
		
		catch(ConcurrentModificationException e){
			System.out.println("exception handled");
		}

		
		System.out.println(j);
	}

}
