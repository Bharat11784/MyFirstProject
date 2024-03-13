package com.tech.practice1;


class Pen{
	
	public void pentypes() {
		
		System.out.println("types of pens is 10");
	}
}
	
class Ballpen extends Pen{
	
	public void ballpentypes() {
		System.out.println("types of ballpen types are 15");
	}
	
}

class Inkpen extends Ballpen{
	
	public void inkpentypes() {
		
		System.out.println("types of inkpens are 20");
	}
	
}


public class Multilevel {
	
	public static void main(String[]args) {
		Ballpen nm=new Ballpen();
		nm.ballpentypes();
		nm.pentypes();
		Inkpen mn=new Inkpen();
		mn.inkpentypes();
	}

}
