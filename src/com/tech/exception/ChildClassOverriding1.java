package com.tech.exception;

class Parent1 {
	void msg()throws ArithmeticException{
		System.out.println("parent");
	}
}



public class ChildClassOverriding1 extends Parent1{
	
	void msg() throws ArithmeticException{
		System.out.println("child");
	}
	
	public static void main(String[]args) {
		ChildClassOverriding1 hj=new ChildClassOverriding1();
		hj.msg();
		Parent1 df=new Parent1();
		df.msg();
	}

}
