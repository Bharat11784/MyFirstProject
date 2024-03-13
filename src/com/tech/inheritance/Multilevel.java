package com.tech.inheritance;

class Pen{
	
	public void pentypes() {
		System.out.println("there are two types of pen");
	}
}

class Ballpen extends Pen {
	
	public void ballpenink() {
		
		System.out.println("ballpen ink is blue");
	}
}


class Gelpen extends Ballpen{
	
	public void gelpenink() {
		System.out.println("gelpen ink is red");
	}
	
}

public class Multilevel {
	
	public static void main(String[]args) {
		
		Gelpen kl=new Gelpen();
		kl.ballpenink();
		kl.gelpenink();
		kl.pentypes();
	}

}
