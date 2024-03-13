package com.tech.exception;

class Parent{
	
	void msg() {
		System.out.println("Parent");
	}
}

public class ChildClassOverriding extends Parent {
	
	void msg() throws RuntimeException{
		
		System.out.println("test exception child");
		
	}
	
	

	public static void main(String[] args) {
		
		ChildClassOverriding gh=new ChildClassOverriding();
		gh.msg();
		Parent bn=new Parent();
		bn.msg();

	}

}
