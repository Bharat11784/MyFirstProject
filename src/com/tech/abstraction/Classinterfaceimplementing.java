package com.tech.abstraction;

public class Classinterfaceimplementing implements Interfacesample, Interfacesample2 {
	
	public String loginwithphoneno() {
		System.out.println("common method");
		return null;
	}
	
	public String loginwithcommonphone() {
		System.out.println("implemented");
		return null;
	}
	
	public String sample() {
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
	
	public void defaultmethod() {
		Interfacesample.staticmethod();
	}
	
	public static void main(String []args) {
		Interfacesample inter=new Classinterfaceimplementing();
	inter.loginwithcommonphone();
		inter.loginwithphoneno();
		inter.sample();
		
		Interfacesample2 inter1=new Classinterfaceimplementing();
		inter1.sample1();
		inter1.sample2();
		
		Classinterfaceimplementing inter2=new Classinterfaceimplementing();
		inter2.loginwithcommonphone();
		inter2.loginwithphoneno();
		inter2.defaultmethod();
		
		
	}
}
