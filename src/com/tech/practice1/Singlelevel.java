package com.tech.practice1;


class Animal{
	
	public void animalname() {
		System.out.println("name of the animal");
	}
}

class Dog extends Animal{
	
	public void dogname() {
		System.out.println("name of the dog");
	}
}

public class Singlelevel {
	
	public static void main(String[]args) {
		
		Dog bn=new Dog();
		bn.animalname();
		bn.dogname();
		
	}

}
