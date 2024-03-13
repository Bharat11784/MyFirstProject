package com.tech.practice;

public class Clonemethodsample implements Cloneable {
	
	String name;
	int rollno;
	
	Clonemethodsample(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	
	public static void main(String[]args) throws CloneNotSupportedException {
		
		Clonemethodsample tyu=new Clonemethodsample("bharat",10);
		Clonemethodsample uio=(Clonemethodsample)tyu.clone();
		
		System.out.println(tyu);
		System.out.println(uio);
		
		System.out.println(tyu.name+ "  "+tyu.rollno);
		System.out.println(uio.name+  "  "+uio.rollno);
	}

}
