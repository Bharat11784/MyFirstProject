package com.tech.practice;

class Parent{
	
	String firstname;
	int salary=200000;
	
	Parent(){
		System.out.println("parent constructor");
		
		firstname="bharat";
	}
	
	public int salarymethod() {
		System.out.println("parent salary method called:"  +salary);
		return this.salary;
	}
}

class Child extends Parent{
	
	String firstname;
	int salary;
	
	Child(String firstname,int salary){
		System.out.println("child constructor");
		this.firstname=firstname;
		this.salary=salary;
	}
	
	public void childmethod() {
	//	System.out.println("child method called");
		System.out.println(super.firstname);
		System.out.println(super.salary);
	}
}
public class TestInheritance5 {
	
	public static void main(String[]args) {
		Child vb=new Child("mahanth",500000);
	System.out.println(vb.firstname);
	System.out.println(vb.salary);
		
		vb.childmethod();
		//vb.salarymethod();
	}
	

}
