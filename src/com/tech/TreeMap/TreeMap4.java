package com.tech.TreeMap;
import java.util.Comparator;
import java.util.TreeMap;
public class TreeMap4 {           ///TreeMap Comparator//

	public static void main(String[] args) {
		TreeMap<Integer,String> b=new TreeMap<Integer,String>(new MyComp());
		b.put(888, "haliyal");
		b.put(222, "hubli");
		b.put(666, "dharwad");
		b.put(444, "gadag");
		System.out.println(b);
	}
}
class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return -i1.compareTo(i2);
	}
}

