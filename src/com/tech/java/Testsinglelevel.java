package com.tech.java;

class Parent{
	String firstname;
	int salary=100000;
	
	Parent(){
		System.out.println("constructor called");
		firstname="bharat";
	}
	
	public int salarymethod() {
		System.out.println("parent salary: "   +salary);
		
		return this.salary;
	}
	
}

class Child extends Parent{
	
	String lastname;
	int salary;
	
	Child(String lastname,int salary){
		System.out.println("parameterized constructor called");
		
		this.lastname=lastname;
		this.salary=salary;
	}
	
	public void method1() {
		System.out.println("method1 called");
		System.out.println(super.firstname);	
	}
}


public class Testsinglelevel {
	
	public static void main(String[]args) {
		Child jk=new Child("patil",200000);
		System.out.println(jk.lastname);
		System.out.println(jk.salary);
		jk.salarymethod();
		//jk.method1();
		System.out.println(jk.firstname);
	}

}
