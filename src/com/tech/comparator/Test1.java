package com.tech.comparator;
import java.util.Collections;
import java.util.LinkedList;
public class Test1 {
	public static void main(String[] args) {
		LinkedList<Product> l=new LinkedList<Product>();
		
		l.add(new Product(222,"fan",24));
		l.add(new Product(111,"pen",80));
		l.add(new Product(444,"bottle",10));
		l.add(new Product(333,"chair",80));
		
		Collections.sort(l,new IdComp ());
		
		
		for(Product j:l) {
			System.out.println(j.id+ "  "+j.name+"  "+j.cost);
		}
	}
}
