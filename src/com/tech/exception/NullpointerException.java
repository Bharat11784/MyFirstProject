package com.tech.exception;

public class NullpointerException {

	public static void main(String[]args) {
		
		String str=null;
		
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("null pointer exceptions occur");
		}
		System.out.println("rest of code");
	}
}
