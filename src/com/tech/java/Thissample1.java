package com.tech.java;

public class Thissample1 {
	
	String firstname;
	String lastname;
	int rollno;
	
	Thissample1(String firstname,String lastname,int rollno){
		System.out.println("constructor called");
		this.firstname=firstname;
		this.lastname=lastname;
		this.rollno=rollno;
	}
	
	public void method1() {
		
		System.out.println("method1 called");
		this.method2();
	}
	
	public void method2() {
		System.out.println("method2 called");
	}
	
	public static void main(String[]args) {
		
		Thissample1 jkl=new Thissample1("bharat","patil",10);
		
		System.out.println(jkl.firstname);
		System.out.println(jkl.lastname);
		System.out.println(jkl.rollno);
		jkl.method1();
	}

}
