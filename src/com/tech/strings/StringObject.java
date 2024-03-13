package com.tech.strings;

public class StringObject {
	
	public static void main(String[]args) {
		
		String str="abc";
		String str1="abc";
		
		
		String str2=new String("welcome");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
	}

}
