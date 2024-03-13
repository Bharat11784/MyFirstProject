package com.tech.java;

public class AbstractExtendingClass extends AbstractClassSample {
	
	int p,q;
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition2(int a,int b) {
		return a+b;
	}
	
	public int addition3(int a, int b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		
		AbstractClassSample abstractClassSample=new AbstractExtendingClass();
		
		System.out.println(abstractClassSample.addition1(10, 20));
		System.out.println(abstractClassSample.addition2(30, 20));
		System.out.println(abstractClassSample.addition3(40, 20));
		System.out.println(abstractClassSample.addition(50, 20));
	}

}
