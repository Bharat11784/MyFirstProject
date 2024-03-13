package com.tech.exception;

public class TestExceptionPropagation {  //unchecked exception//
	
	void m(){
		
		int a=30/0;
	}
	
	void n() {
		m();
	}
	
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[]args) {
		TestExceptionPropagation obj=new TestExceptionPropagation();
		obj.p();
		System.out.println("normal flow");
	}

}
