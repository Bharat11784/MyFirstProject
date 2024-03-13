package com.tech.practice1;

public interface Interfacesample {
	
	String sample1();
	String sample2();
	String sample3();

	public static final int samplevariable=10;
	final int sampleVariale2=40;
	
	default void defaultmethod() {
		System.out.println("default method is called");
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
		System.out.println("private static method called");
		
	}
	
}
