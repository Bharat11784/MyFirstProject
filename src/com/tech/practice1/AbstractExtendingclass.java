package com.tech.practice1;

public class AbstractExtendingclass extends Abstractclassssample{
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition1(int a,int b) {
		return a+b;
	}
	
	public int addition2(int a, int b) {
		return a+b;
	}
	
	public int additionChildspecific(int a, int b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		
		Abstractclassssample hjk=new AbstractExtendingclass();
		
		System.out.println(hjk.addition(30, 60));
		
		System.out.println(hjk.addition1(50, 60));
		
		System.out.println(hjk.addition2(70, 80));
		System.out.println(hjk.addition3(10, 20));
		
		AbstractExtendingclass opt=new AbstractExtendingclass();
		System.out.println(opt.additionChildspecific(60, 90));
		
		
	}

}
