package com.tech.practice;
                                                         //unchecked exception//
public class TestExceptionPropagation {
	
	void m() {
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
			e.printStackTrace();
			System.out.println("exception handled");
		}
	}
	
	public static void main(String[]args) {
		TestExceptionPropagation jkl=new TestExceptionPropagation();
		
		jkl.p();
		System.out.println("normal flow");
	}

}
