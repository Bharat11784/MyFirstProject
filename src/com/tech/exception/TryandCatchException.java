package com.tech.exception;

public class TryandCatchException {

	public static void main(String[]args) {
		
		int a[]=new int[5];
		
		try {
			a[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println("Array Index Out O fBounds Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
