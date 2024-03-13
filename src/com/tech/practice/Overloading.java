package com.tech.practice;

public class Overloading {
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition(int a, int b,int c) {
		return a+b+c;
	}
	
	public float addition(float a, float b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		
		Overloading lp=new Overloading();
		System.out.println(lp.addition(1.0f, 2.8f));
		
		System.out.println(lp.addition(20, 30));
		System.out.println(lp.addition(40, 50, 60));
		
	}

}
