package com.tech.java;

public interface interfaceSample {
	int sampleVariable=0;
	final int sampleVariable12=0;
	public static final int sampleVariableNew=1;
	
	String sample1();
	String sample2();
	String loginwithphoneno();
	
	
	default void defaultMethod() {
		System.out.println("default method called");
		privatemethod();
	}
	
	static void staticMethod() {
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
