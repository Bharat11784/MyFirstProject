package com.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleArrayList4 {

	public static void main(String[] args) {
		ArrayList<String>h=new ArrayList<String>();
		
		h.add("hubli");
		h.add("gadag");
		h.add("bangalore");
		h.add("haliyal");
		System.out.println(h);
		//convert arraylist to array
		
	  Object objectarray[]=h.toArray();
	  
	 System.out.println(objectarray);
	 
	 System.out.println(Arrays.toString(objectarray));
	 
	List<Object> list1=Arrays.asList(objectarray);
	System.out.println(list1);

	}

}
