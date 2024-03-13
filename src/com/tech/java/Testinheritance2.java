package com.tech.java;

class Pen{
	                                             //[Hierarchical level]
	public void ink() {
		System.out.println("blue ink");
	}
}


class Ballpen extends Pen{
	
	public void refill() {
		System.out.println("refill length");
	}
}


class Gelpen extends Pen{
	public void cap() {
		
		System.out.println("cap length");
	}
}

public class Testinheritance2 {
	
	public static void main(String[]args) {
		
		Gelpen k=new Gelpen();
		k.ink();
		k.cap();
		Ballpen n=new Ballpen();
		n.refill();
		
	}
	
	
}
