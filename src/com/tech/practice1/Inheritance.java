package com.tech.practice1;

class Parent{
	
	String firstname;
	int salary=100000;
	
	Parent(){
		firstname="bharat";
	}
	
	public int classsalarymethod() {
		System.out.println("parent salary" +salary);
		return this.salary;
	}
}


class Child extends Parent{
	
	String fname;
	int rollno;
	int salary;
	
	Child(String fname,int rollno,int salary){
		this.fname=fname;
		this.rollno=rollno;
		this.salary=salary;
	}
	
	public void childclassmethod() {
		System.out.println(super.firstname);
		System.out.println(super.salary);
	}
	
	
}
public class Inheritance {
	public static void main(String[]args) {
	
	Child ui=new Child("savita",01,200000);
	
	System.out.println(ui.fname);
	System.out.println(ui.rollno);
	System.out.println(ui.salary);
	
	ui.childclassmethod();
	}

}
