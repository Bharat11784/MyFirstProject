package com.tech.java;

public class ClassImplementingInterface implements interfaceSample1,interfaceSample {
	
	
	public String loginwithphoneno() {
		System.out.println("implemented");
		return null;
	}
	
	public String loginwithphoneno1() {
		System.out.println("implemented");
		return null;
	}
	
	public String loginwithphoneno2() {
		System.out.println("implemented");
		return null;
	}
	
	public String sample1() {
		System.out.println("implemented");
		return null;
	}
	
	public String sample2() {
		System.out.println("implemented");
		return null;
	}
	
	public void defaultMethod() {
		System.out.println("overriden default method called");
		interfaceSample.staticMethod();
	}
	
	public static void main(String []args) {
	interfaceSample hjk =new ClassImplementingInterface();
	hjk.sample1();
	hjk.sample2();
	hjk.loginwithphoneno();
	
	interfaceSample1 kl =new ClassImplementingInterface();
	kl.loginwithphoneno1();
	kl.loginwithphoneno2();
	
	ClassImplementingInterface tr=new ClassImplementingInterface();
	tr.loginwithphoneno();
	tr.loginwithphoneno1();
	tr.loginwithphoneno2();
	 
}
}
