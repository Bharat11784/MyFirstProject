package com.tech.comparator;
import java.util.ArrayList;
import java.util.Collections;
public class Test {
	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		
		al.add(new Emp(111, "mahanth"));
		al.add(new Emp(444, "savita"));
		al.add(new Emp(222, "navami"));
		al.add(new Emp(333, "bharat"));
		
		System.out.println("before sort;" +al);
		
		
		Collections.sort(al, new EnameComp());
		
		for(Emp h:al)
		{
			System.out.println(h.eid+" " +h.ename);
		}
	}

}
