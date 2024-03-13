package com.tech.abstraction;

public interface Interfacesample {
	
	String loginwithphoneno();
	 String loginwithcommonphone();
	 String sample();
	 
	 final static int samplevariable=0;
	 final static int samplevariale12=0;
	 
	 default void defaultmethod() {
		 System.out.println("default method called");
		 privatemethod();
	 }
	 
	 static void staticmethod() {
		 System.out.println("static method called");
		 privatestaticmethod();
	 }
	 
	 private void privatemethod() {
		 System.out.println("privatestatic method called");
	 }
	 
	 private static void privatestaticmethod() {
		 System.out.println("privatestatic method called");
	 }

}
