package com.tech.java;

public class AggregationSample {
	
	String name;
	int rollno;
	Address studentadd;
	
	AggregationSample(String name,int rollno, Address studentadd){
		
		this.name=name;
		this.rollno=rollno;
		this.studentadd=studentadd;
	}
	
	
	public static void main(String[]args) {
		
		Address address=new Address(51,"bangalore","karnataka");
		AggregationSample obj=new AggregationSample("bharat",1,address);
		
		System.out.println(obj.name);
		System.out.println(obj.rollno);
		System.out.println(address.streetno);
		System.out.println(address.city);
		System.out.println(address.state);
		
	}
}
class Address{
	
	int streetno;
	String city;
	String state;
	
	Address(int streetno,String city,String state){
		this.streetno=streetno;
		this.city=city;
		this.state=state;
	}	
}