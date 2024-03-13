package com.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<String> r1=new ArrayList<String>();
		
		r1.add("gadag");
		r1.add("hubli");
		r1.add("haliyal");
		r1.add("hangal");
		
		System.out.println(r1);
		
		ArrayList<String> f1=new ArrayList<String>();
		f1.add("gadag");
		f1.add("bangalore");
		f1.add("bharat");
		System.out.println(f1);
		
		if(r1.containsAll(f1)) {
			System.out.println("elements contains");
		}
		else {
			System.out.println("elements not contains");
		}
		
		r1.retainAll(f1);
		
		System.out.println(r1);
		
		
		

	}

}
