package com.tech.abstraction;

public class AbstractExtendingClass extends AbstractClassSample{
	
	int p,q;
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition1(int a, int b) {
		return a+b;
	}
	
	public int addition2(int a, int b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		
		AbstractClassSample bnm=new AbstractExtendingClass();
		System.out.println(bnm.addition(20, 50));
		System.out.println(bnm.addition1(40, 50));
		System.out.println(bnm.addition2(20, 80));
		System.out.println(bnm.addition3(60, 90));
	}

}
