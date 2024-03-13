package com.tech.practice;

public interface Interfacesample1 {
	
	String loginwithphoneno();
	String sample();
	
	final static int samplevariable=0;
	final  int samplevariable1=0;
	
	default void defaultmethod() {
		System.out.println("default method called");
		privatemethod();
	}
	
	static void staticmethod() {
		System.out.println("static method called");
		privatestaticmethod();
	}
	
	private void privatemethod() {
		System.out.println("privatemethod called");
	}
	
	private static void privatestaticmethod() {
		System.out.println("privatestatic method called");
	}
	
	

}
