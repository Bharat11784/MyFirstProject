package com.tech.TreesetComparator;
import java.util.Comparator;
import java.util.TreeSet;
public class Test4 {

	public static void main(String[] args) {
		
		TreeSet<Product> t=new TreeSet<Product>(new MyComp4());
		
		t.add(new Product(333,"chair",1000.1));
		t.add(new Product(111,"pen",500.3));
		t.add(new Product(555,"table",800.9));
		t.add(new Product(222,"bottle",600.8));
		
		for(Product h:t) {
			System.out.println(h.id+" "+h.name+" "+h.cost);
		}

	}

}

class MyComp4 implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.id==p2.id)
		return 0;
		
		else if(p1.id>p2.id)
			return 1;
		
		else
		return -1;
	}

	
}








