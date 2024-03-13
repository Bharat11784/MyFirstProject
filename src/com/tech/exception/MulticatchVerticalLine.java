package com.tech.exception;

public class MulticatchVerticalLine {

	public static void main(String[] args) {
		
		String str=null;
		
		try {
			System.out.println(str.length());
		}

		catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException e) {
			
			e.printStackTrace();
			System.out.println("exception occurs");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of code");
	}

}
