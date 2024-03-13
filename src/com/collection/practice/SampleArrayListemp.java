package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;



public class SampleArrayListemp {

	public static void main(String[] args) {
		
		ArrayList<Emp>y=new ArrayList<Emp>();
		y.add(new Emp(222,"bharat"));
		y.add(new Emp(111,"mahanth"));
		y.add(new Emp(444,"navami"));
		y.add(new Emp(333,"savita"));
		
      Collections.sort(y, new EidComp());

      for(Emp g:y) {
    	  System.out.println(g.eid+" "+g.ename);
      }
	}

}

