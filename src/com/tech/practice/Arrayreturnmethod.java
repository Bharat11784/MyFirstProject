package com.tech.practice;

public class Arrayreturnmethod {
	
	static int[] get() {
		
		int a[]= {1,2,3,5,8};
		return a;
	}
	
	public static void main(String[]args) {
		
		int arr[]=get();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
