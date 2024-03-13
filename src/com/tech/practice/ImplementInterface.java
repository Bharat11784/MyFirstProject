package com.tech.practice;

public class ImplementInterface implements Interfacesample1,Interfacesample2{
	
	public String loginwithphoneno() {
		System.out.println("implemented");
		return null;
	}

	public String sample() {
		System.out.println("implemented");
		return null;
	}
	
	public String sample3() {
		System.out.println("implemented");
		return null;
	}
	
	public String loginwithnewphone() {
		System.out.println("implemented");
		return null;
	}
	
	public void defaultmethod() {
		System.out.println("overridden method");
		Interfacesample1.staticmethod();
	}
	
	public static void main(String[]args) {
		
		ImplementInterface re=new ImplementInterface();
		System.out.println(re.loginwithphoneno());
		System.out.println(re.sample());
		System.out.println(re.loginwithnewphone());
		System.out.println(re.sample3());
		re.defaultmethod();
	}
}
