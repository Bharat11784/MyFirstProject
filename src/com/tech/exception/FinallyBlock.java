package com.tech.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		
		try {
			a[4]=20/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("exception occurs");
		}
		
		finally {
			System.out.println("finally block is always executed");
		}
		
		System.out.println("rest of code");

	}

}
