package com.tech.practice;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String s){
		super(s);
	}
}

public class TestCustomException {
	
	static void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("age is not valid");
		else
			System.out.println("valid age");
	}
	
	public static void main(String[]args) {
		
		try {
			System.out.println("age passed as 13");
			validate(13);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try {
			System.out.println("age is passed 20");
			validate(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("rest of code");
		
		
	}

}
