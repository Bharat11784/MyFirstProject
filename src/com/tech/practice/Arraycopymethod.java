package com.tech.practice;

public class Arraycopymethod {
	
	public static void main(String[]args) {
		
		char[]ar= {'s','d','b','h','a','r','a','t','j','k'};
		
		char sp[]=new char[6];
		
		System.arraycopy(ar, 2, sp, 0, 6);
		
		System.out.println(String.valueOf(ar));
		System.out.println(String.valueOf(sp));
	}

}
