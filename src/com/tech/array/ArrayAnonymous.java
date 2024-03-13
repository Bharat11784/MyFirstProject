package com.tech.array;

public class ArrayAnonymous {

	public static void main(String[]args) {
		
		printArray(new int[] {10,40,50,60});
		printArray(new float[] {2.0f,3.2f});
	}
	
	static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void printArray(float arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
