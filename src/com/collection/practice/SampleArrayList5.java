package com.collection.practice;

import java.util.ArrayList;

public class SampleArrayList5 {

	public static void main(String[] args) {

     ArrayList<Student> a1=new ArrayList<Student>();
     
     a1.add(new Student(101,"ravi",15));
     a1.add(new Student(201,"sono",10));
     a1.add(new Student(301,"ragu",20));
     
     
     for(Student k:a1) {
     
    	 System.out.println(k.rollno+" "+k.name+" "+k.age);

	}
     
}
}
