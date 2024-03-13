package com.tech.TreesetComparator;
import java.util.Comparator;
import java.util.TreeSet;
public class Customizedsorting {
	public static void main(String[] args) {
		TreeSet<Integer> j=new TreeSet<Integer>(new MyComp1());
		j.add(50);
		j.add(20);
		j.add(80);
		j.add(10);
		System.out.println(j);
	}
}

class MyComp1 implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return -i1.compareTo(i2);
	}
}
