package com.tech.practice1;

public class ClassimplementingInterface implements Interfacesample,Interfacesample1 {
	
	public String sample1() {
		System.out.println("sample1 method called");
		return null;
		
	}
	
	public String sample2() {
		System.out.println("sample2 method called");
		return null;
	}
	
	public String sample3() {
		System.out.println("sample3 method called");
		return null;
	}
	
	public String loginwithphoneno() {
		System.out.println("loginphone method called");
		return null;
	}
	
	public String loginwithphoneNo1() {
		System.out.println("loginphone1 method called");
		return null;
	}
	
	public void defaultmethod() {
		System.out.println("defaultmethod called");
		Interfacesample.staticmethod();
	}
	
	
	public static void main(String[]args) {
	
		ClassimplementingInterface hjk=new ClassimplementingInterface();
		
		hjk.sample1();
		hjk.sample2();
		hjk.loginwithphoneno();
		hjk.loginwithphoneNo1();
		hjk.defaultmethod();
		
		
		
	}
	
}
