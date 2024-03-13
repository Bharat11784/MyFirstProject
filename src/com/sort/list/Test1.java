package com.sort.list;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<Product> u=new ArrayList<Product>();
		
		u.add(new Product(888,"pen"));
		u.add(new Product(111,"book"));
		u.add(new Product(666,"bag"));
		u.add(new Product(222,"chair"));
		
		Collections.sort(u, new IdComp());
		
		for(Product n:u) {
			System.out.println(n.id+" "+n.name);
		}

	}

}
