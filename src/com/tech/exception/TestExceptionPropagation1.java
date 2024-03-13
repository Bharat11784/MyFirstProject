package com.tech.exception;

import java.io.IOException;

public class TestExceptionPropagation1 {
	
	void m() throws IOException{
		throw new IOException("device error");
	}
	
	void n() throws IOException {
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
		
		TestExceptionPropagation1 obj=new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow");
	}

}
