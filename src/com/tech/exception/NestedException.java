package com.tech.exception;

public class NestedException {

	public static void main(String[]args) {
		
		try {
			System.out.println("some statements");
			
			try {
				int b=40/0;
			}
			catch(ArithmeticException e) {
				//e.printStackTrace();
				System.out.println(e);
			}
			
			try {
				int a[]=new int[6];
				a[6]=90;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		System.out.println("normal flow");
	}
	
	
	
}
