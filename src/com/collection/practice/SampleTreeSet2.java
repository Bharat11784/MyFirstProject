package com.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class SampleTreeSet2 {

	public static void main(String[] args) {
		
		TreeSet<Integer>g=new TreeSet<Integer>(new Mycomp1());
		g.add(100);
		g.add(20);
		g.add(120);
		g.add(50);
		
		System.out.println(g);
	}
}

class Mycomp1 implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		if(i1==i2)
		return 0;
		else if(i1<i2)
			return 1;
			else
				return -1;
	}	
}
