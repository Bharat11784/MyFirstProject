package com.tech.practice;
                                                   //Hieraracal//

class Vehicle{
	
	public void vehicletypes() {
		System.out.println("different types of vehicles");
	}
}

class Fourwheeler extends Vehicle{
	public void car() {
		System.out.println("car is fourwheeler");
	}
}

class Sixwheeler extends Vehicle{
	public void bus() {
		System.out.println("bus is six wheeler");
	}
}

public class TestInheritance3 {

	public static void main(String[]args) {
		
		Sixwheeler bn=new Sixwheeler();
		bn.vehicletypes();
		bn.bus();
		Fourwheeler nm=new Fourwheeler();
		nm.car();
		
		
	}
	
}
