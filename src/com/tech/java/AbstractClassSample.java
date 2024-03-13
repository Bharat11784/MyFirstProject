package com.tech.java;

public abstract class AbstractClassSample {
	public abstract int addition(int a, int b);
	public abstract int addition2(int a, int b);
	public abstract int addition3(int a,int b);
	
	public int addition1(int a,int b) {
		return a+b;
	}
	
	AbstractClassSample(){
		System.out.println("constructor called");
	}
	
	public static void main(String[]args) {
		
	}
}
