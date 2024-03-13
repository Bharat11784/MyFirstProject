package com.tech.java;


class Overridingparentclass{
	
	String firstname="parent class";
	static int salary=200000;
	int rollid=10;
	
	public int salarymethod() {
	//	System.out.println("parent class"  +a);
		return salary;
	}
	
	
}

public class Overridingchildclass extends Overridingparentclass {
	
	String firstname="childclass";
	int rollid=112;
	
	public void childmethod() {
		System.out.println("child method called");
	}
	
	public int salarymethod() {
		System.out.println("child salary method called");
		return 300000;
	}
	
	public static void main(String[]args) {
		Overridingchildclass op=new Overridingchildclass();
		System.out.println(op.firstname);
		System.out.println(op.salarymethod());
		System.out.println(op.rollid);
		
		Overridingparentclass ty=new Overridingparentclass();
		System.out.println(ty.firstname);
		System.out.println(ty.salarymethod());
		System.out.println(ty.rollid);
	}

}
