package com.tech.practice;

public class AggregationSample {
	
	String firstname;
	int rollno;
	Address studentAddr;
	
	AggregationSample(String firstname,int rollno,Address studentAddr){
		this.firstname=firstname;
		this.rollno=rollno;
		this.studentAddr=studentAddr;
	}
	
	public static void main(String[]args) {
		
		Address address=new Address("soudamini","bangalore","india");
		AggregationSample opm=new AggregationSample("bharat",10,address);
		
		System.out.println(opm.firstname);
		System.out.println(opm.rollno);
		System.out.println(address.streetname);
		System.out.println(address.city);
		System.out.println(address.country);
		
	}

}

class Address{
	String streetname;
	String city;
	String country;
	
	Address(String streetname,String city,String Country){
		this.streetname=streetname;
		this.city=city;
		this.country=country;
		
	}
}
