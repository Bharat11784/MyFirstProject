package com.tech.practice1;

class Overriddingparentsample{
	
	String fname;
	static int salary=600000;
	
	Overriddingparentsample(){
		fname="bharat";
	}
	
	public int salaryofEmp() {
		System.out.println("parent salary"  +salary);
		return salary;
	}
	
}

class Overriddingchildsample extends Overriddingparentsample{
	
	String firstname;
	String lastname;
	int rollno;
	
	Overriddingchildsample(String firstname,String lastname,int rollno){
		this.firstname=firstname;
		this.lastname=lastname;
		this.rollno=rollno;
	}
	
	public int salaryofEmp(int a) {
		System.out.println("child salary");
		return 800000;
	}
}

public class Typecasting {
	
	public static void main(String[]args) {
		
		Overriddingparentsample rt=new Overriddingchildsample("mahanth","patil",1);
		Overriddingchildsample op=(Overriddingchildsample)rt;
		
		boolean bool=rt instanceof Overriddingchildsample;
		System.out.println(bool);
		
		System.out.println(rt.fname);
		rt.salaryofEmp();
		
		System.out.println(op.firstname);
		System.out.println(op.lastname);
		System.out.println(op.rollno);
	    System.out.println(op.salaryofEmp(1));
	}

}
