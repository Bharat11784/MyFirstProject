package com.tech.array;

public class ArrayReturningMethod {

	static int[] get() {
		int a[]= {20,30,40};
		return a;
	}
	
	public static void main(String []args) {
		int arr[]=get();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
