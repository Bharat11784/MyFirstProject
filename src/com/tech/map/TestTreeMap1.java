package com.tech.map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestTreeMap1 {

	public static void main(String[] args) {

		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
        
        t.put(101, "bharat");
        t.put(105, "savita");
        t.put(103, "navami");
        t.put(108, "mahanth");
        
        System.out.println(t);
        
      SortedMap<Integer,String> sm= t.subMap(105, 108);
      
      System.out.println(sm);

	}

}

/*class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {


		return -i1.compareTo(i2);
	}
}*/
