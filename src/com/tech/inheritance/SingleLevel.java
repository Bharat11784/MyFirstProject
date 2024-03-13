package com.tech.inheritance;

class Animal{
	
 public void animaleat() {
	 System.out.println("animal eat meat");
 }
}

class Dog extends Animal{
	
	public void dogbark() {
		System.out.println("dog barking");
	}
}


public class SingleLevel {
	public static void main(String[]args) {
		
		Dog opl=new Dog();
		opl.animaleat();
		opl.dogbark();
	}

}
