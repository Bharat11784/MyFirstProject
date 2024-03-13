package com.tech.practice;

import java.io.IOException;

public class TestExceptionpropagation1 {
	
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
			System.out.println("exception handled");
		}
	}
	
	public static void main(String[]args) {
		TestExceptionpropagation1 dfg=new TestExceptionpropagation1();
		dfg.p();
		System.out.println("normal flow");
	}
	

}
