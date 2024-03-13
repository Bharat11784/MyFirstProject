package com.tech.java;
import java.util.Scanner;

public class EncapsulationSample {
	
	private int empID=10;
	private int age=40;
	private String empname="bharat";
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public static void main(String[]args) {
		
		EncapsulationSample ret=new EncapsulationSample();
	System.out.println(ret.empID);
    System.out.println(ret.empname);
    
    System.out.println("enter data");
    Scanner scan=new Scanner(System.in);
    
    ret.setAge(scan.nextInt());
    System.out.println("enter data");
    ret.setEmpID(scan.nextInt());
    
    
    System.out.println(ret.getAge());
    System.out.println(ret.getEmpID());
    
    
    
    
    
    
    
		
	}
	
	
	

}
