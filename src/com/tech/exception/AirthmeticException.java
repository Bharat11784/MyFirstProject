package com.tech.exception;

public class AirthmeticException {
	
	public static void main(String []args) {
		
		int a[]=new int[6];
		
		try {
			a[5]=20/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
			System.out.println("Arithmetic exception occurs");
		}
		System.out.println("rest of code");
	}

}
