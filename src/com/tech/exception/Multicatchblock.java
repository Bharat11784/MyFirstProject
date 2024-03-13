package com.tech.exception;

public class Multicatchblock {

	public static void main(String[]args) {
		
		int a[]=new int[8];
		
		String str=null;
		
		
		try {
			a[4]=20/0;
			a[8]=10;
			System.out.println(str.length());
			
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("arithmetic exception occurs");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("null pointer exceptions occur occurs");
		}
		
		System.out.println("rest of code ");
		
	}
	
	
	
	
}
