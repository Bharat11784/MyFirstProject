package com.tech.practice;

class Parent5{
	String firstname;
	static int salary=800000;
	
	
	Parent5(){
		
		firstname="bharat";
	}
	
	public int salarymethod() {
		System.out.println("parent salary:"  +salary);
		return salary;
		
	}
}

class Child1 extends Parent5{
	
	String firstname;
	int salary=200000;
	
	Child1(){
		firstname="savita";
	}
	
	public int salarymethod() {
		System.out.println("child salary:"  +salary);
		return salary;
	}
	
}

public class TypeCasting {
	
	public static void main(String[]args) {
		
		Parent5 jk=new Child1();
		Child1 nm=(Child1)jk;
		
		boolean bool=jk instanceof Child1;
		System.out.println(bool);
		
		System.out.println(nm.firstname);
		System.out.println(nm.salary);
		
		System.out.println(jk.firstname);
		
		System.out.println(jk.salary);
	}

}
