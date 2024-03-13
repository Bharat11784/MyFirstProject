package com.tech.java;

class OverridingParentCasting{
	
	String firstname="mahanth";
	int rollno=1;
	static int salary=200000;
	
	OverridingParentCasting(){
		System.out.println("parent constructor called");
	}
	
	public int salarymethod() {
		System.out.println("parent salary method:"  +salary);
		return salary;
	}
}

class OverridingChildCasting extends OverridingParentCasting{
	 String lastname="patil";
	 int rollno=2;
	 
	 OverridingChildCasting(){
		 System.out.println("child constructor called");
	 }
	 
	 public int salarymethod() {
		 System.out.println("child salary method:" +salary);
		 return 500000;
	 }
	 
}

public class TypeCasting {
	public static void main(String[]args) {
	
	//up casting
	
	OverridingParentCasting overridingparent=new OverridingChildCasting();
	//down casting
	
	OverridingChildCasting casting=(OverridingChildCasting)overridingparent;
	
	
	System.out.println(casting.firstname);
	System.out.println(casting.rollno);
	
	
	boolean bool=overridingparent instanceof OverridingChildCasting;
	
	System.out.println(bool);
	
	
	
	
	
	}

}
