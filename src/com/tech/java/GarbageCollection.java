package com.tech.java;

public class GarbageCollection {
	public static void main(String[]args) {
		
		GarbageCollection t1=new GarbageCollection();
		
		GarbageCollection t2=new GarbageCollection();
		
		System.out.println("garbagecollection called");
		
		t1=null;
		
		System.out.println(new GarbageCollection());
		System.gc();
	}
		
		protected void finalize() {
			System.out.println("object collected:"  +this);
		}
	}
	
	

