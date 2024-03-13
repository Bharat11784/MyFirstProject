package com.tech.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSample4 {

	public static void main(String[] args) {
		
		String arr[]= {"dog","animal","cat"};
		
		ArrayList<String> s1= new ArrayList<String>();
		
		s1.add("bharat");
		s1.add("savita");
		s1.add("navami");
		s1.add("mahanth");
		
		System.out.println(s1);
		
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("apurva");
		c1.add("rashmi");
		c1.add("savita");
		c1.add("bharat");
		
		System.out.println(c1);
		
		//retain all//
		
		s1.retainAll(c1);
		System.out.println(s1);
		
		
		
		
		//collection to array//
		
	Object[]objectArray	=c1.toArray();
	
	System.out.println(objectArray);
		
	
	
	//Arrays to String
	
System.out.println(Arrays.toString(objectArray));



//Array to ArrayList

ArrayList af=new ArrayList(Arrays.asList(arr));
System.out.println(af);
	

	}

}
