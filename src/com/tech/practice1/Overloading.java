package com.tech.practice1;

public class Overloading {
	
	public int addition(int a,int b) {
		return a+b;
		
	}
	
	public int addition(int a,int b,int c) {
		return a+b+c;
	}
	
	public float addition(float a,float b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		
		Overloading zx=new Overloading();
		
		System.out.println(zx.addition(10, 20));
		
		System.out.println(zx.addition(20, 30, 40));
		System.out.println(zx.addition(10.4f, 30.6f));
	}

}
