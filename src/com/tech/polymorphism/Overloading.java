package com.tech.polymorphism;

public class Overloading {
	
	public int addition(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	public int addition(int a, int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	
	public float addition(float a, float b) {
		float sum=a+b;
		return sum;
	}
	
	public static void main(String[]args) {
		
		Overloading ui=new Overloading();
		
		System.out.println(ui.addition(20, 30));
		System.out.println(ui.addition(30, 40, 50));
		System.out.println(ui.addition(23.3f, 40.5f));
		
	}
	

}
