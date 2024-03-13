package com.tech.practice;

class Animal{
	public void animaleat() {
		System.out.println("animaleating");
	}
}

class Dog extends Animal{
	
	public void dogbark() {
		System.out.println("dog barking");
	}
}

public class TestInheritance {

	public static void main(String[]args) {
		Dog hj=new Dog();
		hj.animaleat();
		hj.dogbark();
	}
	
	
}
