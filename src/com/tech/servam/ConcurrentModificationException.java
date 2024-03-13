package com.tech.servam;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationException {
	public static void main(String[]args) {
		
		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		System.out.println(l1);
		
		try {
			Iterator itr=l1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
				l1.add(7);
			}
		}
		
		catch(Exception e) {
			System.out.println("exception handled");
			e.printStackTrace();
		}
	}
	
}


