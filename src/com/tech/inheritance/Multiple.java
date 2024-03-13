package com.tech.inheritance;

interface Man{
	
	public void manwalk();
}


interface Woman{
	public void womanwalk();
}


class Human implements Man,Woman{
	
	public void manwalk() {
		System.out.println("different manwalk");
	}
	
	public void womanwalk() {
		System.out.println("different womanwalk");
	}
}

public class Multiple {
	
	public static void main(String []args) {
		
		Human gh=new Human();
		gh.manwalk();
		gh.womanwalk();
		
	}

}
