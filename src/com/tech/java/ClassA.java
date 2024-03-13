package com.tech.java;



class ClassB{
	String firstname="bharat";
	int salary=1000;
	
	ClassB(){
		System.out.println("no argument constructor called");
	}
	
	ClassB(String firstname){
		System.out.println("parameterized constructor called");
		this.firstname=firstname;
	}
	
	public int salarymethod() {
		System.out.println("salary method"  +salary);
		return this.salary;
	}
	
	
}

public class ClassA extends ClassB {
	
	String lastname;
	int rollno;
	
     ClassA(String lastname,int rollno){
		System.out.println("parameterized constructor called");
		
		this.lastname=lastname;
		this.rollno=rollno;
		
	}
	
	public void childmethod() {
		
		System.out.println("childmethod called");
		System.out.println(super.firstname);
	}
	
	public static void main(String[]args) {
		
		ClassA child=new ClassA("patil",100);
		
		System.out.println(child.lastname);
		System.out.println(child.rollno);
		child.salarymethod();
		child.childmethod();
		
	
	}

}
