package com.tech.inheritance;

class Vehicle{
	
	public void vehicletypes() {
		System.out.println("differnt vehicle types in market");
	}
	
}


class Car extends Vehicle{
	
	public void cartypes() {
		System.out.println("10 types of car");
	}
}


class Bike extends Vehicle{
	
	public void biketyes() {
		System.out.println("20 types of bike");
	}
}

public class Hierarchical {
	public static void main(String[]args) {
		
		Bike yu=new Bike();
		yu.biketyes();
		yu.vehicletypes();
	   Car tr=new Car();
	   tr.cartypes();
	}

}
