package com.tech.practice;

public class Arraypassingmethod {
	
	
	static void min(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
	
	public static void main(String[]args) {
		
		int a[]= {30,55,78,98,87};
		
		System.out.println(a.length);
		
		min(a);
		
	}

}
