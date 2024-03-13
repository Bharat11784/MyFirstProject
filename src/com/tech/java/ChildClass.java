package com.tech.java;

class ParentClass{
	String name="parent";
	int salary=100;
	
	ParentClass(){
		
		System.out.println("no-argument constructor called");
		
		}
	
	ParentClass(String name,int salary){
		System.out.println("parameterized constructor called");
		this.name=name;
		this.salary=salary; 
	}
	
	public void method1() {
		
		System.out.println("method1 from parent called");
	}
	
	public void method2() {
		System.out.println("method2 is called");
	}
	
}





public class ChildClass extends ParentClass {
	
	String name;
	int salary;
	
	
	ChildClass(String name,int salary){
		
		System.out.println("parameterized child class constructor called");
		
		this.name=name;
		this.salary=salary;
		
	}
	
	
	public void method3() {
		
		System.out.println("method3 is called");
		
		ChildClass child=new ChildClass("bharat",1000);
		System.out.println(super.name);
		System.out.println(super.salary); 
	}
	
	
	public static void main(String[]args) {
		
		ChildClass child=new ChildClass("bharat",1000);
		
		child.method1();
		System.out.println(child.name);
		System.out.println(child.salary);
		
		child.method3();
		
		
	}
	

}
