package com.tech.comparator;
import java.util.Comparator;
public class IdComp implements Comparator<Product>{
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
