package com.tech.practice1;

public class Thissample {
	
	String fname,fname1,fname2,lastname,lastname1;
	int salary;
	
	Thissample(String fname,String fname1,String fname2){
		this.fname=fname;
		this.fname1=fname1;
		this.fname2=fname2;
	}
	
	Thissample(String fname,String fname1,String fname2,String lastname,String lastname1,int salary){
		this(fname,fname1,fname2);
		this.lastname=lastname;
		this.lastname1=lastname1;
		this.salary=salary;
	}
	
	public void method1() {
		System.out.println("method1 is called");
		this.method2();
	}
	
	public void method2() {
		System.out.println("method2 is called");
	}
	
	public static void main(String[]args) {
		Thissample op=new Thissample("bharat","savita","navami","mahanth","patil",400000);
		
		System.out.println(op.fname);
		System.out.println(op.fname1);
		System.out.println(op.fname2);
		System.out.println(op.lastname);
		System.out.println(op.lastname1);
		System.out.println(op.salary);
		op.method1();
	
	}
	
	

}
