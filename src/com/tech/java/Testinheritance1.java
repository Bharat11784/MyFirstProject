package com.tech.java;

class Cat{                                   //[Multilevel inheritance]
	
	public void bark() {
		System.out.println("barking");
	}
}

class Tiger extends Cat{
	
	public void eat() {
		System.out.println("eating");
	}
}


class Babytiger extends Tiger{
	
	public void sleep() {
		System.out.println("sleeping");
	}
}

public class Testinheritance1 {
	
	public static void main(String[]args) {
		
		Babytiger d=new Babytiger();
		
		d.bark();
		d.eat();
		d.sleep();
		
	}

}
