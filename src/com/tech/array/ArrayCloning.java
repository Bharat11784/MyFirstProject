package com.tech.array;

public class ArrayCloning {

	public static void main(String[]args) {
		
		int array[]= {50,60,70,80};
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		
	int clonedarray[]=array.clone();
	
	for(int i=0;i<clonedarray.length;i++) {
		System.out.println(clonedarray[i]);
	}
	
	System.out.println(array==clonedarray);
	}
}
