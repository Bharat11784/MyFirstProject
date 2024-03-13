package com.tech.sort;
import java.util.ArrayList;
import java.util.Collections;
public class Test2 {
	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		
		al.add(new Emp(111,"navami"));
		al.add(new Emp(444,"savita"));
		al.add(new Emp(222,"mahanth"));
		al.add(new Emp(333,"bharat"));
		
		Collections.sort(al);
		
		for(Emp h : al) {
			System.out.println(h.eid+"  "+h.ename);
		}
	}
}
