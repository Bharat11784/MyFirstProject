package com.tech.practice;
                                              //multilevel//

class Pen{
	public void pentypes() {
		System.out.println("two types of pen");
	}
}

class Ballpen extends Pen {
	
	public void ballpenink() {
		System.out.println("ink is blue");
	}
}

class Gelpen extends Ballpen{
	public void gelpenrefill() {
		System.out.println("refill is red");
	}
}

public class TestInheritance1 {
	
	public static void main(String[]args) {
		Gelpen ds=new Gelpen();
		ds.ballpenink();
		ds.gelpenrefill();
		ds.pentypes();
		
	}

}
