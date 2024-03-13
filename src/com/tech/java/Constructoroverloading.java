package com.tech.java;

public class Constructoroverloading {
	
	String firstname;
	String firstname1;
	String lastname;
	int salary;
	
	Constructoroverloading(String firstname,String firstname1){
		this.firstname=firstname;
		this.firstname1=firstname1;
	}
	
	Constructoroverloading(String firstname,String firstname1,String lastname,int salary){
		
		this(firstname,firstname1);
		this.lastname=lastname;
		this.salary=salary;
	}
	
	public static void main(String[]args) {
		Constructoroverloading ds=new Constructoroverloading("bharat","savita","patil",200000);
		System.out.println(ds.firstname);
		System.out.println(ds.firstname1);
		System.out.println(ds.lastname);
		System.out.println(ds.salary);
	}

}
