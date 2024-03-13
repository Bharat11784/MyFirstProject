package com.tech.practice;



public abstract class Abstraction {
	
	public abstract int addition(int a, int b);
	
	public abstract int addition1(int a,int b);
	
	public abstract int addition2(int a,int b);
	
	public int addition3(int a, int b) {
		return a+b;
	}
	
	Abstraction(){
		System.out.println("constructor called");
	}
	
	public static void main() {
		
	}
	
	

}
