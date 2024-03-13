package com.tech.practice;

public class Abstractionchild extends Abstraction {
	
	int p,q;
	
	public int addition(int a,int b) {
		return a+b;
	}
	
	public int addition1(int a, int b) {
		return a+b;
	}
	
	public int addition2(int a,int b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		
		Abstraction op=new Abstractionchild();
		System.out.println(op.addition(20, 30));
		System.out.println(op.addition1(50, 80));
		System.out.println(op.addition3(80, 90));
	}

}
