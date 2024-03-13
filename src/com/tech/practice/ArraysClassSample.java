package com.tech.practice;

import java.util.Arrays;

public class ArraysClassSample {
	
	public static void main(String[]args) {
		
		char array1[]= {'y','t','d','e','w','a','q'};
		System.out.println(String.valueOf(array1));
		
		//string to character//
		
		String arr1="bharatkumar";
		
	char arr5[]	=arr1.toCharArray();
	
	for(char e:arr5) {
		System.out.println(e);
	}
	
	System.out.println();
	//sort//
	
	Arrays.sort(array1);
	for(char d:array1) {
		System.out.println(d);
	}
	
	System.out.println();
	System.out.println();
	//numer sort//
	
	int a[]= {8,1,9,2,5};
	for(int g:a) {
		System.out.println(g);
	}
	System.out.println();
	System.out.println();
	Arrays.sort(a);
	for(int h:a) {
		System.out.println(h);
	}
	System.out.println();
	System.out.println();
	
	int ar[]=new int[10];
	
	Arrays.fill(ar, 1000);
	System.out.println(ar[0]);
	System.out.println(ar[9]);

	
	System.out.println();
	System.out.println();
	
  System.out.println(Arrays.binarySearch(array1, 's'));
	}

}
