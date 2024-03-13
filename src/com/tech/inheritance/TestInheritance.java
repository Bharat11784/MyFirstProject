package com.tech.inheritance;

class ParentClass{
	
	String firstname;
	int salary=200000;
	int rollid=1;
	
	ParentClass(){
		System.out.println("parent constructor called");
		firstname="bharat";
	}
	
	public int salarymethod() {
		System.out.println("salary method called:"  +salary);
		return this.salary;
	}
	
}

class ChildClass extends ParentClass{
	
	String firstname;
	int rollno;
	int salary;
	
	
	ChildClass(String firstname,int rollno,int salary){
		System.out.println("child constructor called");
		
		this.firstname=firstname;
		this.rollno=rollno;
		this.salary=salary;
	}
	
	public void childclassmethod() {
		
		System.out.println("child class method called");
		
		System.out.println(super.firstname);
		System.out.println(super.rollid);
		
	}
	
}

public class TestInheritance {
	public static void main(String[]args) {
		
		ChildClass hjk=new ChildClass("bharat",1,300000);
		System.out.println(hjk.firstname);
		System.out.println(hjk.rollno);
		System.out.println(hjk.salary);
		hjk.salarymethod();
		hjk.childclassmethod();
	}

}
