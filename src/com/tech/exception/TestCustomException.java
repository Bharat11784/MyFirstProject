package com.tech.exception;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String s){
		super(s);
	}
}

public class TestCustomException {
	
	static void validate(int age) throws InvalidAgeException{
		
		if(age<18)
			throw new InvalidAgeException("Age is not valid");
		else
		System.out.println("Age is valid");
		
	}
	
	public static void main(String[]args) {
		
		try {
			System.out.println("Age is passed 13");
			validate(13);
		}
		catch(Exception e) {
			System.out.println("exception occured:"  +e);
			e.printStackTrace();
		}
		
		try {
			System.out.println("Age is passed 19");
			validate(19);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("rest of code");
	}


}