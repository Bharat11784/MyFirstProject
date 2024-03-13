package com.tech.java;

class SSP{
	
	String firstname="shivangouda";
	int salary=45000;
	
	/*SSP(){
		System.out.println("no-argument constructor called");
		
		firstname="shivangouda";
	}
	
	/*SSP(String firstname){
		System.out.println("constructor called");
		
		this.firstname=firstname;
	}*/
	
	public int salarymethod() {
		System.out.println("salary method called:"    +salary);
		return this.salary;
	}

}


public class BSP extends SSP{
	
	String firstname;
	int rollno;
	int salary;
	
	BSP(String firstname,int rollno,int salary){
		
		this.firstname=firstname;
		this.rollno=rollno;
		this.salary=salary;
	}
	
	public void method1() {
		System.out.println("method1 called");
		System.out.println(super.firstname);
	}
	
	public static void main(String[]args) {
		BSP fgh=new BSP("bharat",175,200000);
		System.out.println(fgh.firstname);
		System.out.println(fgh.rollno);
		System.out.println(fgh.salary);
		fgh.method1();
		fgh.salarymethod();
	}

}
