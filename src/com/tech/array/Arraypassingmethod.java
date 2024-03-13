package com.tech.array;

public class Arraypassingmethod {
	
	public static void main(String[]args) {
		
		int a[]= {20,40,50,60,70};
		System.out.println(a.length);
		min(a);
	}
	
	static void min(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
