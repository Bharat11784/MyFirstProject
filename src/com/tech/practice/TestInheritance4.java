package com.tech.practice; 
                                                                   //multiple//
interface College{
	
	public void collegename();
}

interface University{
	public void university();
}

class Childimplements implements College,University{
	
	public void collegename() {
		System.out.println("college name is vdit:");
	}
	
	public void university() {
		System.out.println("name is vtu");
	}
}

public class TestInheritance4 {
	
	public static void main(String[]args) {
		
		Childimplements kl=new Childimplements();
		kl.collegename();
		kl.university();
	}

}
