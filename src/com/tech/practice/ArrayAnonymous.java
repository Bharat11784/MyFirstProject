package com.tech.practice;

public class ArrayAnonymous {
	
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
	
	
	
	
	
	public static void main(String[]args) {
		printArray(new int[] {2,3,5,4,7});
		printArray(new float[] {7,5,9,3});
	}

}
