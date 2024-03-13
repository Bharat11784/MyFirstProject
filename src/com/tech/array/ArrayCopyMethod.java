package com.tech.array;

public class ArrayCopyMethod {
	public static void main(String[]args) {
		
		char arry1[]= {'c','b','h','a','r','a','t','k'};
		
		char arry2[]=new char[6];
		
		System.arraycopy(arry1, 1, arry2, 0, 6);
		
		System.out.println(String.valueOf(arry1));
		System.out.println(String.valueOf(arry2));
	}

}
