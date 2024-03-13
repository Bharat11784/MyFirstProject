package com.tech.strings;

public class StringClass {
	
	public static void main(String[]args) {
		
		String s1="sachin";
		
		String s2="sachin";
		
		String s3="sachinsachiniijjjjj";
		
	//	System.out.println(s3.indexOf('a',5));
		
	//	System.out.println(s3.lastIndexOf('a',10));
		
		System.out.println(s2.substring(1, 5));
		
		System.out.println(s2.replace('a', 'b'));
		System.out.println(s2.replaceFirst("s", "n"));
	}

}
