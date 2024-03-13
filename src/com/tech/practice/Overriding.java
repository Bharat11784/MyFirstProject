package com.tech.practice;


class Parent2{
	String firstname;
	static int salary=500000;
	
	
	Parent2(){
		firstname="bharat";
	}
	
	public int salarymethod() {
		System.out.println("parent salary method called:"  +salary);
		return salary;
	}
}


public class Overriding extends Parent2 {
	
	String firstname;
	int rollno;
	int salary=1000000;
	
	Overriding(String firstname,int rollno){
		this.firstname="mahanth";
		this.rollno=1;
		
	}
	
	public int salarymethod() {
		System.out.println("child salary method called:"   +salary);
		return salary;
	}
	
	
	
	public static void main(String[]args) {
		
		Overriding as=new Overriding("mahanth",1);
		System.out.println(as.firstname);
		System.out.println(as.rollno);
		as.salarymethod();
		
		Parent2 sz=new Parent2();
		System.out.println(sz.firstname);
		System.out.println(sz.salary);
		
	}

}
