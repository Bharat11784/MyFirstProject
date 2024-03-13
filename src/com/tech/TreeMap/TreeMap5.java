package com.tech.TreeMap;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
public class TreeMap5 {
	public static void main(String[] args) {
		TreeMap<Product,Integer> y=new TreeMap<Product,Integer>(new MyComp6());
		y.put(new Product(444,"india"), 1);
		y.put(new Product(222,"usa"), 2);
		y.put(new Product(777,"china"), 3);
		y.put(new Product(111,"russia"), 4);
	
		Set<Product> s=y.keySet();
		
		for(Product k:s) {
			System.out.println(k.id+" "+k.name);
		}
	}
}
class MyComp6 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		if(p1.id==p2.id)
		return 0;
		
		else if(p1.id<p2.id)
			return 1;
		
		return -1;
	}
}
