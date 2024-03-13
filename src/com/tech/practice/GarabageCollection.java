package com.tech.practice;

public class GarabageCollection {
	
	public static void main(String[]args) {
		
		GarabageCollection t1=new GarabageCollection();
		
		GarabageCollection t2=new GarabageCollection();
		
		
		System.out.println("garabage collection called");
		
		t1=null;
		
		System.out.println(new GarabageCollection());
		
		System.gc();
		
	}
	
	protected void finalize() {
		
		System.out.println("object garabage collected:"  +this);
	}

}
