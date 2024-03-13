package com.tech.map;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {

		 HashMap<Integer,String> t=new HashMap<Integer,String>();
		 
		 t.put(101, "bharat");
         t.put(105, "savita");
         
         HashMap<Integer,String> t1=new HashMap<Integer,String>(t);
         
         t1.put(103, "navami");
         t1.put(108, "mahanth");
         
         System.out.println(t1);
         
         HashMap<Integer,String> t2=new HashMap<Integer,String>();
         t2.putAll(t1);
         t2.putAll(t);
         t2.put(110, "nhjg");
         System.out.println(t2);

	}

}
