package com.tech.java;

class OverridingParentCasting{
	
	String firstname="bharat";
	String lastname="patil";
	int salary=200000;

	OverridingParentCasting(){
		
	}
	
	public int salary() {
		
		System.out.println("parent salary:"  +salary);
		return salary;
	}	
}

class OverridingChildCasting extends OverridingParentCasting{
	
	String firstname="mahanth";
	int rollno=2;
	
	OverridingChildCasting(){
		System.out.println("child constructor");
	}
	
	public int salary() {
		
		System.out.println("child salary");
		return 300000;
	}
	
}

public class TypeCasting2 {
	
	public static void main(String []args) {
		
		OverridingParentCasting dsf=new OverridingChildCasting();
		
		OverridingChildCasting bnm=(OverridingChildCasting)dsf;
		
		
		boolean bool=dsf instanceof OverridingChildCasting;
		System.out.println(bool);
		
		System.out.println(bnm.firstname);
		System.out.println(bnm.lastname);
		System.out.println(bnm.rollno);
		
		
	}

}
