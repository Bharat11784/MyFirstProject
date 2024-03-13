package com.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class SampleTreeSet3 {

	public static void main(String[] args) {

      TreeSet<Product> c=new TreeSet<Product>(new Mycomp2());
      
      c.add(new Product(333,"pen",10.2));
      c.add(new Product(222,"book",20.5));
      c.add(new Product(888,"pencil",5.7));
      c.add(new Product(666,"bag",60.8));

      for(Product s:c) {
    	  System.out.println(s.id+" "+s.name+" "+s.cost);
      }
      
	}

}

class Mycomp2 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {

         return p1.name.compareTo(p2.name);
	}

	
	
	
}
