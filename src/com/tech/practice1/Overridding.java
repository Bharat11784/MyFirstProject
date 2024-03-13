package com.tech.practice1;

class Overriddingparent{
	
	String fname;
	static int salary=500000;
	
	Overriddingparent(){
		fname="mahanth";
	}
	
	public int salaryofEmp() {
		System.out.println("salary of parent   "    +salary);
		return salary;
	}
}

class Overriddingchild extends Overriddingparent{
	
	String firstname;
	String lastname;
	int rollno;
	
	Overriddingchild(String firstname,String lastname,int rollno){
		this.firstname=firstname;
		this.lastname=lastname;
		this.rollno=rollno;
	}
	
	public int salaryofEmp(int a) {
		System.out.println("salary of child");
		return 400000;
	}
	
	
}

public class Overridding {
	
	public static void main(String[]args) {
		
		Overriddingchild sw=new Overriddingchild("bharat","patil",01);
		Overriddingparent ty=new Overriddingparent();
		
		System.out.println(sw.firstname);
		System.out.println(sw.lastname);
		System.out.println(sw.rollno);
	System.out.println(sw.salaryofEmp(1));
		
		System.out.println(ty.fname);
	    ty.salaryofEmp();
		
	}
	

}
