package com.tech.practice;

public class Arraydefault {
public static void main(String[]args) {
	
	int arr[]=new int[5];
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	double arr2[]=new double[10];
	for(double e:arr2) {
		System.out.println(e);
	}
	
	String arr3[]=new String[10];
	arr3[5]="bharat";
	for(String str:arr3) {
	System.out.println(str);
	}
	
	
}
}
