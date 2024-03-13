package com.tech.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test9 {

	public static void main(String[] args) {
		
		TreeMap<Product,Integer> f=new TreeMap<Product,Integer>(new Compn());
		
		f.put(new Product(110,"pen"), 1);
		f.put(new Product(101,"book"), 2);
		f.put(new Product(102,"bag"), 3);
		f.put(new Product(105,"bottle"), 4);
		
		Set<Product>d=f.keySet();
		
		for(Product l:d) {
			System.out.println(l.id+" "+l.name);
		}
		

	}

}

class Compn implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
	if	(p1.id==p2.id)
		return 0;
		
		else if(p1.id<p2.id)
			return 1;
	
		else
			return -1;
		
	}
	
}
