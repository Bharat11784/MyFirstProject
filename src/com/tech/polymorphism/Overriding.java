package com.tech.polymorphism;

class OverridingParent{
	
	String firstname;
	int rollno;
	static int salary=400000;
	
	OverridingParent(){
		System.out.println("parent constructor called");
		firstname="bharat";
		rollno=10;
	}
	
	public int salary() {
		System.out.println("parent salary:"  +salary);
		return salary;
	}
}

class OverridingChild extends OverridingParent{
	String firstname;
	String lastname;
	int rollno;
	int salary=500000;
	
	OverridingChild(String firstname,String lastname,int rollno){
		 
		this.firstname=firstname;
		this.lastname=lastname;
		this.rollno=rollno;
	}
	
	public int salary() {
		System.out.println("child salary:"  +salary);
		return 500000;
	}
	
	public void childmethod() {
		System.out.println("child method called");
		System.out.println(super.firstname);
		System.out.println(super.rollno);
		super.salary();
	}
	
}

public class Overriding {
	public static void main(String[]args) {
		OverridingChild rty=new OverridingChild("mahanth","patil",1);
		System.out.println(rty.firstname);
		System.out.println(rty.lastname);
		System.out.println(rty.rollno);
		rty.childmethod();
		rty.salary();
		rty.childmethod();
		
		
	}
}
