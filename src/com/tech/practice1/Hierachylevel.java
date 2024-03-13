package com.tech.practice1;

class Vehicle{
	
	public void vehicletypes() {
		System.out.println("different types of vehicle");
	}
}

class Twowheeler extends Vehicle{
	
	public void twowheelertypes() {
		System.out.println("2-wheeler types");
		
	}
}
	
class Fourwheeler extends Vehicle{
		
		public void fourwheelertypes() {
			System.out.println("4-wheeler types");
		}
	}


public class Hierachylevel {
	public static void main(String[]args) {
		
		Twowheeler fg=new Twowheeler();
		fg.twowheelertypes();
		fg.vehicletypes();
		
		Fourwheeler re=new Fourwheeler();
		
		re.fourwheelertypes();
		re.vehicletypes();
		
	}

}
