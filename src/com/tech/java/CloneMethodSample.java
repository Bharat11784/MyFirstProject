package com.tech.java;

public class CloneMethodSample implements Cloneable {
	
	int rollno;
	String name;
	
	CloneMethodSample(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	
	public static void main(String[]args) throws CloneNotSupportedException {
		
		CloneMethodSample s1=new CloneMethodSample(1,"mahanth");
		CloneMethodSample s2=(CloneMethodSample)s1.clone();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.rollno+ "  "  +s1.name);
		System.out.println(s2.rollno+ "  " +s2.name);
		
		
	}

}
