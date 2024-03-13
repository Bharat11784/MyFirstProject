package com.tech.java;

interface ManEat{
	
	public void eat();
}

interface ManTravel{
	
	public void travel();
	
}

 class Man implements ManEat,ManTravel{
	
	public void eat() {
		System.out.println("Man is eating");
	}
	
	public void travel() {
		System.out.println("Man is travel");
	}
	
}

public class Demo {
	
	public static void main(String[]args) {
		Man a =new Man();
		a.eat();
		a.travel();
	}

}
