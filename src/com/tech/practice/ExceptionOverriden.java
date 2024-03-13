package com.tech.practice;

class Parent8 {
	
	void msg() throws ArithmeticException {
		System.out.println("parent8");
	}
}



public class ExceptionOverriden extends Parent8  {
	
	void msg() throws ArithmeticException {
		System.out.println("test exception child");
	}
	
	public static void main(String[]args) {
		
		ExceptionOverriden hgf=new ExceptionOverriden();
		hgf.msg();
		
		
	}

}
