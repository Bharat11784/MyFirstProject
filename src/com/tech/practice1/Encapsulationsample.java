package com.tech.practice1;

import java.util.Scanner;

public class Encapsulationsample {
	
	private int age=39;
	private int rollno=1;
	private String fname="bharat";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>17 && age<100) {
			this.age = age;
		}
		else {
			System.out.println("invalid age entered");
		}
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	public static void main(String[]args) {
		
		Encapsulationsample vu=new Encapsulationsample();
		
		System.out.println(vu.getAge());
		System.out.println(vu.getRollno());
		System.out.println(vu.getFname());
		
		System.out.println("entered data");
		
		Scanner scan=new Scanner(System.in);
		
		vu.setAge(scan.nextInt());
		vu.setRollno(scan.nextInt());
		vu.setFname(scan.next());
	}
	

}
