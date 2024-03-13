package com.tech.java;

public class Overloading {
	
	public int addition(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public int addition(int a,int b,int c) {
		int d=a+b+c;
		return d;
	}
	
	public float addition(float a,float b) {
		float g=a+b;
		return g;
	}
	
	public static void main(String[]args) {
		
		Overloading kl=new Overloading();
		
		System.out.println(kl.addition(10, 20));
		System.out.println(kl.addition(10, 20, 30));
		System.out.println(kl.addition(10.5f, 20.3f));
	}

}
