package com.tech.practice1;

public class Aggregationsampleclass {
	
	String studentname;
	int rollno;
	Address studentAddr;
	
	Aggregationsampleclass(String studentname,int rollno,Address studentAddr){
		
		this.studentname=studentname;
		this.rollno=rollno;
		this.studentAddr=studentAddr;
	}
	
	public static void main(String[]args) {
		Address address=new Address("akshaycolony",35,"hubli","karnataka");
		
		Aggregationsampleclass fgh=new Aggregationsampleclass("mahanth",1,address);
		System.out.println(fgh.studentname);
		System.out.println(fgh.rollno);
		System.out.println(address.streetname);
		System.out.println(address.streetnum);
		System.out.println(address.city);
		System.out.println(address.state);
		
	}
}

class Address{
	
	String streetname;
	int streetnum;
	String city;
	String state;
	
	Address(String streetname,int streetnum,String city,String state){
		this.streetname=streetname;
		this.streetnum=streetnum;
		this.city=city;
		this.state=state;
	}
	
	
}
