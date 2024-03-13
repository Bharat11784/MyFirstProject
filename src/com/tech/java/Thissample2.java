package com.tech.java;

public class Thissample2 {

	String firstname,firstname2,firstname3,lastname1,lastname2;
	int rollno;
	
	Thissample2(String firstname,String firstname2,String firstname3){
		this.firstname=firstname;
		this.firstname2=firstname2;
		this.firstname3=firstname3;
	}
	
	Thissample2(String firstname,String firstname2,String firstname3,String lastname1,String lastname2,int rollno){
		this(firstname,firstname2,firstname3);
		this.lastname1=lastname1;
		this.lastname2=lastname2;
		this.rollno=rollno;
	}
	
	public static void main(String[]args) {
		Thissample2 hjk=new Thissample2("bharat","savita","navami","mahanth","patil",1);
		System.out.println(hjk.firstname);
		System.out.println(hjk.firstname2);
		System.out.println(hjk.firstname3);
		System.out.println(hjk.lastname1);
		System.out.println(hjk.lastname2);
		System.out.println(hjk.rollno);
		
	}
	
}
