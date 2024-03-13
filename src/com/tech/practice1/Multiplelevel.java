package com.tech.practice1;

interface College{
	
	public void collegename();
}


interface College1{
	public void college1name();
	
}

class University implements College,College1{
	
	public void collegename() {
		System.out.println("college name");
	}
	
	public void college1name() {
		System.out.println("college1 name");
	}
	
	
}

public class Multiplelevel {
	
	public static void main(String[]args) {
		
		University kl=new University();
		
		kl.collegename();
		kl.college1name();
	}

}
